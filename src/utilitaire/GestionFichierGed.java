package utilitaire;

import arbreGene.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GestionFichierGed {
    public boolean lireFichierGest (String fichierGed, Arbre arbre) {
        ArrayList <String> tabLigneGed;
        tabLigneGed = new ArrayList <String>();
        boolean premier = true;
        BufferedReader b = null;

        try {
            b = new BufferedReader( new FileReader(fichierGed));
        } catch (FileNotFoundException e) {
            // TODO catch exeptions lecture fichier GED
            e.printStackTrace();
        }

        String ligne;
        do {
            ligne = null;
            try {
                ligne = b.readLine();
            } catch (IOException e) {
                // TODO catch exeptions lecture ligne fichier GED
                e.printStackTrace();
            }
            tabLigneGed.add(ligne);
        } while (ligne != null);

        //recherche des individus
        //int taille = tabLigneGed.size();
        int i = 0;
        do  {
            i++;
            int debutPersonne = tabLigneGed.get(i).indexOf("@ INDI");
            if (debutPersonne != -1) {
                String nom = null;
                String prenom = null;
                String autrePrenom = null;
                DateUtil dateNaissance = null;
                String lieuNaissance = null;
                boolean decede = false;
                String sexe = null;
                DateUtil dateDeces = null;
                String lieuDeces = null;

                String indice = tabLigneGed.get(i).substring(4, debutPersonne);
                Integer in = new Integer(indice);
                if (premier) {
                    arbre.setRacine(in);
                    premier = false;
                }
                do {
                    i++;
                    //nom + prénom
                    if (tabLigneGed.get(i).indexOf("1 NAME") != -1) {
                        int separateur = tabLigneGed.get(i).indexOf("/");
                        prenom = tabLigneGed.get(i).substring(7, separateur);
                        int separateurAutrePrenom = prenom.indexOf(" ");
                        if (separateurAutrePrenom > 0)
                        {
                            autrePrenom = prenom.substring(separateurAutrePrenom + 1);
                            autrePrenom = Outils.formater(autrePrenom,2);
                            prenom = Outils.formater(prenom.substring(0, separateurAutrePrenom) , 2);
                            
                        }
                        nom = Outils.formater(tabLigneGed.get(i).substring(separateur + 1, tabLigneGed.get(i).indexOf("/", separateur + 1)),1);
                    }
                    //sex
                    if (tabLigneGed.get(i).indexOf("1 SEX") != -1) {
                        String testSex = tabLigneGed.get(i).substring(6);
                        if (testSex.contains("M")){
                            sexe = "Homme";
                        }
                        else if (testSex.contains("F")){
                            sexe = "Femme";
                        }
                    }
                    //naissance
                    if (tabLigneGed.get(i).indexOf("1 BIRT") != -1) {
                        do {
                            i++;
                            if (tabLigneGed.get(i).indexOf("2 DATE") != -1) {
                                dateNaissance = new DateUtil();
                                dateNaissance.setConnus(true);
                                dateNaissance.setDateConnus(tabLigneGed.get(i).substring(7));
                            }
                            if (tabLigneGed.get(i).indexOf("2 PLAC") != -1) {
                                lieuNaissance = tabLigneGed.get(i).substring(7);
                            }
                        } while (tabLigneGed.get(i).charAt(0) > '1');
                        i--;
                    }
                    //décès
                    if (tabLigneGed.get(i).indexOf("1 DEAT") != -1) {
                        do {
                            decede = true;
                            i++;
                            if (tabLigneGed.get(i).indexOf("2 DATE") != -1) {
                                dateDeces = new DateUtil();
                                dateDeces.setConnus(true);
                                dateDeces.setDateConnus(tabLigneGed.get(i).substring(7));
                            }
                            if (tabLigneGed.get(i).indexOf("2 PLAC") != -1) {
                                lieuDeces = tabLigneGed.get(i).substring(7);
                            }
                        } while (tabLigneGed.get(i).charAt(0) > '1');
                        i--;
                    }
                } while (tabLigneGed.get(i).charAt(0) > '0');

                Personne pers = new Personne(nom, prenom, autrePrenom, dateNaissance, lieuNaissance, decede, sexe, dateDeces, lieuDeces);
                FPersonne fpers = new FPersonne(in, pers);
                arbre.maj(in, fpers);
                i--;
            }
            if (tabLigneGed.get(i).indexOf("@ FAM") != -1) {
                Integer inPere = null;
                Integer inMere = null;
                do {
                    i++;
                    if (tabLigneGed.get(i).indexOf("1 HUSB @I") != -1) {
                        inPere = new Integer(tabLigneGed.get(i).substring(9, tabLigneGed.get(i).indexOf("@",9)));
                    }
                    if (tabLigneGed.get(i).indexOf("1 WIFE @I") != -1) {
                        inMere = new Integer(tabLigneGed.get(i).substring(9, tabLigneGed.get(i).indexOf("@",9)));
                    }
                    if (tabLigneGed.get(i).indexOf("1 MARR Y") != -1) {
                        
                        //marrié
                        String lien = "marrié";
                        DateUtil date = null;
                        String lieu = null;
                        do {
                            i++;
                            if (tabLigneGed.get(i).indexOf("2 DATE") != -1) {
                                date = new DateUtil();
                                date.setConnus(true);
                                date.setDateConnus(tabLigneGed.get(i).substring(7));
                            }
                            if (tabLigneGed.get(i).indexOf("2 PLAC") != -1) {
                                lieu = tabLigneGed.get(i).substring(7);
                            }
                        } while (tabLigneGed.get(i).charAt(0) > '1');
                        arbre.get(inPere).addTypeLiens(new TypeLien(inMere, lien, date, lieu, 2));
                        arbre.get(inMere).addTypeLiens(new TypeLien(inPere, lien, date, lieu, 2));
                        i--;
                    }
                    if (tabLigneGed.get(i).indexOf("1 DIV Y") != -1) {
                        //divorce
                        String lien = "divorcé";
                        DateUtil date = null;
                        String lieu = null;
                        do {
                            i++;
                            if (tabLigneGed.get(i).indexOf("2 DATE") != -1) {
                                date = new DateUtil();
                                date.setConnus(true);
                                date.setDateConnus(tabLigneGed.get(i).substring(7));
                            }
                            if (tabLigneGed.get(i).indexOf("2 PLAC") != -1) {
                                lieu = tabLigneGed.get(i).substring(7);
                            }
                        } while (tabLigneGed.get(i).charAt(0) > '1');
                        arbre.get(inPere).addTypeLiens(new TypeLien(inMere, lien, date, lieu, 2));
                        arbre.get(inMere).addTypeLiens(new TypeLien(inPere, lien, date, lieu, 2));
                        i--;
                    }
                    if (tabLigneGed.get(i).indexOf("1 CHIL @I") != -1) {
                        Integer inEnfant = new Integer(tabLigneGed.get(i).substring(9, tabLigneGed.get(i).indexOf("@",9)));
                        if (inPere != null) {
                            arbre.get(inPere).addTypeLiens(new TypeLien(inEnfant, "parent de", null, null, 3));
                            arbre.get(inEnfant).addTypeLiens(new TypeLien(inPere, "enfant de", null, null, 1));
                        }
                        if (inMere != null) {
                            arbre.get(inMere).addTypeLiens(new TypeLien(inEnfant, "parent de", null, null, 3));
                            arbre.get(inEnfant).addTypeLiens(new TypeLien(inMere, "enfant de", null, null, 1));
                        }
                    }
                } while (tabLigneGed.get(i).charAt(0) > '0');
                i--;
            }
        } while (tabLigneGed.get(i).indexOf("0 TRLR") == -1);
            return true;
    }

    public boolean ecrireFichierGest (Arbre arbre) {
        ArrayList <Liens> listeLien = new ArrayList <Liens> (arbre.getListeCleTout().size());

        if (arbre == null)
        {
            System.out.println("Pas de données a écrire");
            return false;
        }

        //ouverture boite de dialogue recherche fichier
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "fichier GED", "ged");
        fc.setFileFilter(filter);

        int returnVal = fc.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomFichier = fc.getSelectedFile().getPath();
            if (nomFichier.length() <= 4 || nomFichier.substring(nomFichier.length() - 4).compareTo(".ged") != 0)
            {
                nomFichier = nomFichier + ".ged";
            }

            BufferedWriter out = null;

            try
            {
                out = new BufferedWriter(new FileWriter(nomFichier));

                //écriture entête
                out.write("0 HEAD ");
                out.newLine();

                //écriture 1ere partie (infos personnels)
                // + sauvegarde des infos a écrire dans 2ème partie
                Set<Integer> listeCleNonTrie = arbre.getListeCleTout();
                Integer[] listeCle = (Integer[]) listeCleNonTrie.toArray(new Integer[listeCleNonTrie.size()]);
                Arrays.sort(listeCle);

                for (int it = 0; it < listeCle.length; it++) {
                    Integer ident = listeCle[it];
                    out.write("0 @I" + ident + "@ INDI");
                    out.newLine();
                    out.write("1 NAME " + arbre.get(ident).getIdentite().getPrenom() + "/" + arbre.get(ident).getIdentite().getNom() + "/");
                    out.newLine();
                    if (arbre.get(ident).getIdentite().getSexe() != null)
                    {
                        String sexe = null;
                        if (arbre.get(ident).getIdentite().getSexe().contains("Homme"))
                        {
                            sexe = "M";
                        }
                        else if (arbre.get(ident).getIdentite().getSexe().contains("Femme"))
                        {
                            sexe = "F";
                        }
                        out.write("1 SEX " + sexe);
                        out.newLine();
                    }
                    if (!" ".equals(arbre.get(ident).getIdentite().getDateNaissance()) || arbre.get(ident).getIdentite().getLieuNaissance() != null)
                    {
                        out.write("1 BIRT ");
                        out.newLine();
                        if (!" ".equals(arbre.get(ident).getIdentite().getDateNaissance()))
                        {
                            out.write("2 DATE " + arbre.get(ident).getIdentite().getDateNaissance());
                            out.newLine();
                        }
                        if (arbre.get(ident).getIdentite().getLieuNaissance() != null)
                        {
                            out.write("2 PLAC " + arbre.get(ident).getIdentite().getLieuNaissance());
                            out.newLine();
                        }
                    }
                    if (arbre.get(ident).getIdentite().isDecede())
                    {
                        out.write("1 DEAT ");
                        out.newLine();
                        if (!" ".equals(arbre.get(ident).getIdentite().getDateDeces()))
                        {
                            out.write("2 DATE " + arbre.get(ident).getIdentite().getDateDeces());
                            out.newLine();
                        }
                        if (arbre.get(ident).getIdentite().getLieuDeces() != null)
                        {
                            out.write("2 PLAC " + arbre.get(ident).getIdentite().getLieuDeces());
                            out.newLine();
                        }
                    }
                    
                    if (arbre.get(ident).getListeTypeLiens() != null)
                    {
                        for (int ind = 0; ind < arbre.get(ident).getListeTypeLiens().size(); ind++)
                        {
                            if (arbre.get(ident).getListeTypeLiens().get(ind).getType() == 2)
                            {
                                Integer epoux;
                                epoux = arbre.get(ident).getListeTypeLiens().get(ind).getAvecPersonne();
                                
                                //recherche si lien existe déja
                                boolean recherche = false;
                                for (int ind2 = 0; ind2 < listeLien.size(); ind2++)
                                {
                                    recherche = listeLien.get(ind2).estParent(epoux) && listeLien.get(ind2).estParent(ident);
                                    if (recherche)
                                    {
                                        break;
                                    }
                                }

                                if (!recherche)
                                {
                                    listeLien.add(new Liens(ident, epoux));
                                }
                            }
                        }
                    }
                    
                    Integer pere = null;
                    Integer mere = null;
                    if (arbre.get(ident).getListeTypeLiens() != null) {
                        for (int ind = 0; ind < arbre.get(ident).getListeTypeLiens().size(); ind++)
                        {
                            TypeLien lien = arbre.get(ident).getListeTypeLiens().get(ind);
                            if (lien.getType() == 1)
                            {
                                if ("Homme".equals(arbre.get(lien.getAvecPersonne()).getIdentite().getSexe())){ //pere
                                    pere = lien.getAvecPersonne();
                                } else { //mere
                                    mere = lien.getAvecPersonne();
                                }
                            }
                        }
                    }
                    
                    if (pere != null)
                    {
                        if (mere != null)
                        {
                            //recherche si lien existe déja
                            boolean recherche = false;
                            int ind2;
                            for (ind2 = 0; ind2 < listeLien.size(); ind2++)
                            {
                                recherche = listeLien.get(ind2).estParent(pere) && listeLien.get(ind2).estParent(mere);
                                if (recherche)
                                {
                                    break;
                                }
                            }
                            if (recherche) //le lien existe
                            {
                                if (!listeLien.get(ind2).estEnfant(ident)) //l'enfant n'est pas dans la liste des enfants
                                {
                                    listeLien.get(ind2).addEnfant(ident);
                                }
                            }
                            else //le lien n'est pas créé
                            {
                                Liens lien;
                                if (pere < mere)
                                {
                                    lien = new Liens(pere, mere);
                                }
                                else
                                {
                                    lien = new Liens(mere, pere);
                                }
                                lien.addEnfant(ident);
                                listeLien.add(lien);
                            }
                        }
                        else // père connu, mère inconnue
                        {
                            //recherche si lien existe déja
                            int ind2;
                            boolean recherche = false;
                            for (ind2 = 0; ind2 < listeLien.size(); ind2++)
                            {
                                recherche = listeLien.get(ind2).estParent(pere) && listeLien.get(ind2).getParents().size() == 1;
                                if (recherche)
                                {
                                    break;
                                }
                            }
                            if (recherche) //le lien existe
                            {
                                if (!listeLien.get(ind2).estEnfant(ident)) //l'enfant n'est pas dans la liste des enfants
                                {
                                    listeLien.get(ind2).addEnfant(ident);
                                }
                            }
                            else //le lien n'est pas créé
                            {
                                Liens lien = new Liens(pere, null);
                                lien.addEnfant(ident);
                                listeLien.add(lien);
                            }
                        }
                    }
                    else if (mere != null) // père inconnu, mere connue
                    {
                        //recherche si lien existe déja
                        int ind2;
                        boolean recherche = false;
                        for (ind2 = 0; ind2 < listeLien.size(); ind2++)
                        {
                            recherche = listeLien.get(ind2).estParent(mere) && listeLien.get(ind2).getParents().size() == 1;
                            if (recherche) //le lien existe
                            {
                                break;
                            }
                        }
                        if (recherche) //le lien existe
                        {
                            if (!listeLien.get(ind2).estEnfant(ident)) //l'enfant n'est pas dans la liste des enfants
                            {
                                listeLien.get(ind2).addEnfant(ident);
                            }
                        }
                        else //le lien n'est pas créé
                        {
                            Liens lien = new Liens(mere, null);
                            lien.addEnfant(ident);
                            listeLien.add(lien);
                        }
                    }

                    if (arbre.get(ident).getListeTypeLiens() != null)
                    {
                        for (int ind = 0; ind < arbre.get(ident).getListeTypeLiens().size(); ind++)
                        {
                            Integer epoux;
                            epoux = arbre.get(ident).getListeTypeLiens().get(ind).getAvecPersonne();
                            boolean recherche = false;
                            int ind2;
                            for (ind2 = 0; ind2 < listeLien.size() && !recherche; ind2++)
                            {
                                recherche = listeLien.get(ind2).estParent(epoux) && listeLien.get(ind2).estParent(ident);
                                if (recherche)
                                {
                                    break;
                                }
                            }

                            if (recherche) //le lien existe
                            {

                                boolean recherche2 = false;
                                for (int ind3 = 0; ind3 < listeLien.get(ind2).getListeTypeLien().size(); ind3++)
                                {
                                    recherche2 = listeLien.get(ind2).getListeTypeLien().get(ind3).estIdentique(arbre.get(ident).getListeTypeLiens().get(ind));
                                    if (recherche2)
                                    {
                                        break;
                                    }
                                }

                                if (!recherche2) //type de lien n'est pas créé
                                {
                                    listeLien.get(ind2).addTypeLien(new TypeLien(arbre.get(ident).getListeTypeLiens().get(ind), null));
                                }

                            }
                            else //le lien n'est pas créé
                            {
                                Liens lien = new Liens(ident, epoux);
                                lien.addTypeLien(new TypeLien(arbre.get(ident).getListeTypeLiens().get(ind), null));
                                listeLien.add(lien);
                            }
                        }

                    }
                }

                //écriture 2ème partie (liens entre personnes)
                if (listeLien != null)
                {
                    for (int ind = 0; ind < listeLien.size(); ind++)
                    {
                        //personnes concernées
                        out.write("0 @F" + (ind + 1) + "@ FAM");
                        out.newLine();
                        for (int ind2 = 0; ind2 < listeLien.get(ind).getParents().size(); ind2++)
                        {
                            Integer parent = listeLien.get(ind).getParents().get(ind2);
                            if ("Homme".equals(arbre.get(parent).getIdentite().getSexe()))
                            {
                                out.write("1 HUSB @I" + parent + "@");
                                out.newLine();
                            }
                            if ("Femme".equals(arbre.get(parent).getIdentite().getSexe()))
                            {
                                out.write("1 WIFE @I" + parent + "@");
                                out.newLine();
                            }
                        }

                        //type de liens
                        if (listeLien.get(ind).getListeTypeLien() != null)
                        {
                            for (int ind2 = 0; ind2 < listeLien.get(ind).getListeTypeLien().size(); ind2++)
                            {
                                TypeLien tyli = listeLien.get(ind).getListeTypeLien().get(ind2);
                                if ("marrié".equals(tyli.getLien()))
                                {
                                    out.write("1 MARR Y");
                                    out.newLine();
                                }
                                else if ("divorcé".equals(tyli.getLien()))
                                {
                                    out.write("1 DIV Y");
                                    out.newLine();
                                }
                                else
                                {
                                    out.write("1 " + tyli.getLien() + " Y");
                                    out.newLine();
                                }
                                if (tyli.getDate() != null && !" ".equals(tyli.getDate().getDate()))
                                {
                                    out.write("2 DATE " + tyli.getDate().getDate());
                                    out.newLine();
                                }
                                if (tyli.getLieu() != null)
                                {
                                    out.write("2 PLAC " + tyli.getLieu());
                                    out.newLine();
                                }
                            }
                        }

                        //enfants
                        if (listeLien.get(ind).getEnfants() != null)
                        {
                            for (int ind2 = 0; ind2 < listeLien.get(ind).getEnfants().size(); ind2++)
                            {
                                Integer enfant = listeLien.get(ind).getEnfants().get(ind2);
                                out.write("1 CHIL @I" + enfant + "@");
                                out.newLine();
                            }
                        }
                    }
                }

                out.write("0 TRLR ");
                out.newLine();

            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
                return false;
            }
            catch(IOException e)
            {
                e.printStackTrace();
                return false;
            }
            finally
            {
                if (out != null)
                {
                    try {
                        out.flush();
                        out.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            }
        }
        else {
            System.out.println("Fichier non selectionné");
            return false;
        }

        return false;
    }
    

}
