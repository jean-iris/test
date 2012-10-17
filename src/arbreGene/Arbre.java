package arbreGene;

import java.awt.Point;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Arbre implements Serializable{
    HashMap <Integer, FPersonne> mapPersonne;
    Integer racine;
    int nbColonne;
    int nbLigne; // nombre niveau ancetres et descendants
    int nombrePersonne = 0;
    LinkedHashMap<Integer, Point> listeGen = null;



    public Arbre() {
        mapPersonne = new HashMap <Integer, FPersonne>();
    }

    public void maj(Integer in, FPersonne fp){
        mapPersonne.put(in, fp);
    }

    public FPersonne get(Integer in) {
        FPersonne fp = mapPersonne.get(in);
        return fp;
    }

    public Integer getRacine() {
        return racine;
    }

    public void setRacine(Integer racine) {
        this.racine = racine;
    }

    public void calculAncetre (Integer id) {
        //calcul dimentions
        nbLigne = 0;
        nbColonne = 0;
        nombrePersonne = 0;

        nbLigne = nbAncetre(id, 1);
        nbColonne = (1 << nbLigne) - 1;


        //calcul coordonnée de chaque personne a afficher
        if( listeGen != null) {
            listeGen.clear();
            listeGen = null;
        }
        listeGen = new LinkedHashMap<Integer, Point>(nombrePersonne);
        fabriquerArbreAncetre(id, nbLigne - 1, 0, nbColonne - 1);
    }

    public void calculEnfant (Integer id) {
        //calcul dimentions
        nbLigne = 0; //calcul lors de la fabrication de l'arbre
        nbColonne = 0; //calcul lors de la fabrication de l'arbre
        nombrePersonne = 0;
        nbEnfant(id); //calcul le nombre de personne a afficher

        //calcul coordonnée de chaque personne a afficher
        if( listeGen != null) {
            listeGen.clear();
            listeGen = null;
        }
        listeGen = new LinkedHashMap<Integer, Point>(nombrePersonne);
        fabriquerArbreEnfant(id, 0, 0);
    }

    public void calculEnfant2 (Integer id) {
        //calcul dimentions
        nbLigne = 0; //calcul lors de la fabrication de l'arbre
        nbColonne = 0; //calcul lors de la fabrication de l'arbre
        nombrePersonne = 0;
        nbEnfant2(id); //calcul le nombre de personne a afficher

        //calcul coordonnée de chaque personne a afficher
        if( listeGen != null) {
            listeGen.clear();
            listeGen = null;
        }
        listeGen = new LinkedHashMap<Integer, Point>(nombrePersonne);
        fabriquerArbreEnfant2(id, 0, 0);
    }


    private int nbAncetre(Integer id, int nb) {
        nombrePersonne ++;
        //int nbAncPere = nb;
        //int nbAncMere = nb;
        int nbAncMax = nb;
        int nbAncTemp;
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                if (get(id).getListeTypeLiens().get(ind).getType() == 1)
                {
                    nbAncTemp = nbAncetre(get(id).getListeTypeLiens().get(ind).getAvecPersonne(), nb + 1);
                    if (nbAncTemp > nbAncMax)
                    {
                        nbAncMax = nbAncTemp;
                    }
                }
            }
        }
        
//        if (get(id).getClePere() != null) {
//            nbAncPere = nbAncetre(get(id).getClePere(), nb + 1);
//        }
//
//        if (get(id).getCleMere() != null) {
//            nbAncMere = nbAncetre(get(id).getCleMere(), nb + 1);
//        }
//        return nbAncPere > nbAncMere ? nbAncPere:nbAncMere;
        return nbAncMax;
    }

    private void nbEnfant(Integer id) {
        nombrePersonne ++;
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                if (get(id).getListeTypeLiens().get(ind).getType() == 3)
                {
                    TypeLien ty = get(id).getListeTypeLiens().get(ind);
                    nbEnfant(get(id).getListeTypeLiens().get(ind).getAvecPersonne());
                }
            }
        }
//        if (get(id).getListeCleEnfants() != null) {
//            for (int ind = 0; ind < get(id).getListeCleEnfants().size(); ind++)
//            {
//                nbEnfant(get(id).getListeCleEnfants().get(ind));
//            }
//        }
    }

    private void nbEnfant2(Integer id) {
        nombrePersonne ++;
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                if (get(id).getListeTypeLiens().get(ind).getType() == 3)
                {
                    nbEnfant2(get(id).getListeTypeLiens().get(ind).getAvecPersonne());
                }
                
                if (get(id).getListeTypeLiens().get(ind).getType() == 2)
                {
                    nombrePersonne ++;
                }
            }
        }
//        if (get(id).getListeCleEnfants() != null) {
//            for (int ind = 0; ind < get(id).getListeCleEnfants().size(); ind++)
//            {
//                nbEnfant2(get(id).getListeCleEnfants().get(ind));
//            }
//        }
//        
//        if (get(id).getListeCleEpoux() != null) {
//            for (int ind = 0; ind < get(id).getListeCleEpoux().size(); ind++)
//            {
//                nombrePersonne ++;
//            }
//        }
    }

    private void fabriquerArbreAncetre(Integer id, int ligne, int gauche, int droite){
        Point ptCourant = new Point(ligne, (droite + gauche) / 2);
        if (listeGen.get(id) == null || listeGen.get(id).getX() > ptCourant.getX()) {
            listeGen.put(id, ptCourant);
        }
        
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                TypeLien lien = get(id).getListeTypeLiens().get(ind);
                if (lien.getType() == 1)
                {
                    if ("Homme".equals(get(lien.getAvecPersonne()).getIdentite().getSexe())){ //pere
                        fabriquerArbreAncetre(lien.getAvecPersonne(), ligne - 1, gauche, (droite + gauche) / 2 - 1);
                    } else { //mere
                        fabriquerArbreAncetre(lien.getAvecPersonne(), ligne - 1, (droite + gauche) / 2 + 1, droite);
                    }
                }
            }
        }
        
//        if (get(id).getClePere() != null) {
//            fabriquerArbreAncetre(get(id).getClePere(), ligne - 1, gauche, (droite + gauche) / 2 - 1);
//        }
//        if (get(id).getCleMere() != null) {
//            fabriquerArbreAncetre(get(id).getCleMere(), ligne - 1, (droite + gauche) / 2 + 1, droite);
//        }
    }

    private int fabriquerArbreEnfant(Integer id, int ligne, int gauche) {
        int droite = gauche;
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                TypeLien lien = get(id).getListeTypeLiens().get(ind);
                if (lien.getType() == 3)
                {
                    droite = fabriquerArbreEnfant(lien.getAvecPersonne(), ligne + 1, droite) + 1;
                }
            }
        }
        
//        if (get(id).getListeCleEnfants() != null)
//        {
//            for (int ind = 0; ind < get(id).getListeCleEnfants().size(); ind++)
//            {
//                droite = fabriquerArbreEnfant(get(id).getListeCleEnfants().get(ind), ligne + 1, droite) + 1;
//            }
//        }
        Point ptCourant = new Point(ligne, (droite + gauche) / 2);
        if (listeGen.get(id) == null || listeGen.get(id).getX() > ptCourant.getX()) {
            listeGen.put(id, ptCourant);
        }

        if (nbLigne < ligne)
        {
            nbLigne = ligne;
        }

        if (nbColonne < droite)
        {
            nbColonne = droite;
        }

        return droite;
    }

    private int fabriquerArbreEnfant2(Integer id, int ligne, int gauche) {
        int droite = gauche;
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                TypeLien lien = get(id).getListeTypeLiens().get(ind);
                if (lien.getType() == 3)
                {
                    droite = fabriquerArbreEnfant2(lien.getAvecPersonne(), ligne + 1, droite) + 1;
                }
            }
        }
        
//        if (get(id).getListeCleEnfants() != null)
//        {
//            for (int ind = 0; ind < get(id).getListeCleEnfants().size(); ind++)
//            {
//                droite = fabriquerArbreEnfant2(get(id).getListeCleEnfants().get(ind), ligne + 1, droite) + 1;
//            }
//        }
        
        Point ptCourant = new Point(ligne, (int)((droite + gauche) / 2));
        if (listeGen.get(id) == null || listeGen.get(id).getX() > ptCourant.getX())
        {
            listeGen.put(id, ptCourant);
        }
        
        if (get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < get(id).getListeTypeLiens().size(); ind++)
            {
                TypeLien lien = get(id).getListeTypeLiens().get(ind);
                if (lien.getType() == 2)
                {
                    Point ptCourant2 = new Point(ptCourant);
                    Integer epoux = lien.getAvecPersonne();
                    if (listeGen.get(epoux) == null || listeGen.get(epoux).getX() > ptCourant.getX())
                    {
                        ptCourant2.y ++;
                        if (droite < ptCourant2.y)
                        {
                            droite = ptCourant2.y;
                        }
                        listeGen.put(epoux, ptCourant2);
                    }
                }
            }
        }
        
//        if (get(id).getListeCleEpoux() != null)
//        {
//            for (int ind = 0; ind < get(id).getListeCleEpoux().size(); ind++)
//            {
//                Point ptCourant2 = new Point(ptCourant);
//                Integer epoux = get(id).getListeCleEpoux().get(ind);
//                if (listeGen.get(epoux) == null || listeGen.get(epoux).getX() > ptCourant.getX())
//                {
//                    ptCourant2.y ++;
//                    if (droite < ptCourant2.y)
//                    {
//                        droite = ptCourant2.y;
//                    }
//                    listeGen.put(epoux, ptCourant2);
//                }
//            }
//        }

        if (nbLigne < ligne)
        {
            nbLigne = ligne;
        }

        if (nbColonne < droite)
        {
            nbColonne = droite;
        }
        
        return droite;
    }

    public LinkedHashMap<Integer, Point> getListeGen() {
        return listeGen;
    }

    public int getNbColonne() {
        return nbColonne;
    }

    public int getNbLigne() {
        return nbLigne;
    }

    /**
        * @return listeCle
        */
    public Set<Integer> getListeCle() {
        return listeGen.keySet();
    }

    public Set<Integer> getListeCleTout() {
        return mapPersonne.keySet();
    }
}