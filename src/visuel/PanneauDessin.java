/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.Arbre;
import arbreGene.TypeLien;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.text.StyledDocument;
import utilitaire.GestionFichierGed;

/**
 *
 * @author Guillet
 */
public class PanneauDessin extends javax.swing.JPanel {

    /**
     * Creates new form PanneauDessinTemp
     */
    public PanneauDessin() {
        initComponents();
    }
    
    /**
     * Creates new form PanneauDessinTemp parametré 
     */
    public PanneauDessin(Arbre arbre) {
        initComponents();
        this.arbre = arbre;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuClickDroit = new javax.swing.JPopupMenu();
        fondEcrant = new javax.swing.JMenuItem();
        trait = new javax.swing.JMenuItem();
        typeAffich = new javax.swing.JMenuItem();
        typeAffichHori = new javax.swing.JMenuItem();
        sauvGED = new javax.swing.JMenuItem();
        resetCouleurSpecial = new javax.swing.JMenuItem();

        fondEcrant.setText("Changer background");
        fondEcrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondEcrantActionPerformed(evt);
            }
        });
        menuClickDroit.add(fondEcrant);

        trait.setText("Changer les traits");
        trait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traitActionPerformed(evt);
            }
        });
        menuClickDroit.add(trait);

        typeAffich.setText("Changer d'affichage");
        typeAffich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichActionPerformed(evt);
            }
        });
        menuClickDroit.add(typeAffich);

        typeAffichHori.setText("Changer d'oriantation");
        typeAffichHori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichHoriActionPerformed(evt);
            }
        });
        menuClickDroit.add(typeAffichHori);

        sauvGED.setText("Sauver format GED");
        sauvGED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauvGEDActionPerformed(evt);
            }
        });
        menuClickDroit.add(sauvGED);

        resetCouleurSpecial.setText("Réinitialiser les couleurs");
        resetCouleurSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCouleurSpecialActionPerformed(evt);
            }
        });
        menuClickDroit.add(resetCouleurSpecial);

        setBackground(couleurFont);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // evenement souris molette
        
        grille = (GridBagLayout) getLayout();
        
        if (zoom <= 600 && evt.getWheelRotation() == -1) {
            zoom += 5;
        } else if (zoom >= 20 && evt.getWheelRotation() == 1) {
            zoom -= 5;
        }
        //TODO poids incrémentation zoom?


        Component[] mesComposants = getComponents();

        //calcul taille du text a metre en place
        int nouvelleTaillePolice;
        int taillePoliceTemporaire;
        int y1 = dimIconePersonne.height;
        int y2 = y1 * zoom / 100;
        int x1 = dimIconePersonne.width;
        int x2 = x1 * zoom / 100;
        nouvelleTaillePolice = (int) (rapportPoliceText * x2);
        taillePoliceTemporaire = (int) (rapportPoliceTextHauteur * (y2 / 3));
        if (taillePoliceTemporaire < nouvelleTaillePolice) {
            nouvelleTaillePolice = taillePoliceTemporaire;
        }

        for (int iCpt = 0; iCpt < mesComposants.length; iCpt++) {
            IconePersonne monIcone = (IconePersonne) mesComposants[iCpt];
            GridBagConstraints gridBagConstraints = grille.getConstraints(monIcone);

            gridBagConstraints.fill = GridBagConstraints.NONE;
            monIcone.setSize(x2, y2);
            monIcone.setTaillePolice(nouvelleTaillePolice);
            if (verticalAffichage)
            {
            gridBagConstraints.ipadx = x2;
            gridBagConstraints.ipady = y2 + 10;
            }
            else
            {
                gridBagConstraints.ipadx = x2 + 10;
                gridBagConstraints.ipady = y2;
            }
            
            grille.setConstraints(monIcone, gridBagConstraints);
        }

        getParent().getParent().getParent().repaint();
        repaint();
    }//GEN-LAST:event_formMouseWheelMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // evenement souris appuyée
        if(evt.getButton() == 3)
        {
            menuClickDroit.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMousePressed

    private void fondEcrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondEcrantActionPerformed
        // action sur fond écrant
        Color couleur;
        couleur = JColorChooser.showDialog(this,"Choix couleur background", couleurFont);
        if (couleur != null)
        {
            couleurFont = couleur;
            setBackground(couleurFont);
            peupler();
        }
    }//GEN-LAST:event_fondEcrantActionPerformed

    private void traitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traitActionPerformed
        // action sur trait
        Color couleur;
        couleur = JColorChooser.showDialog(this,"Choix couleur background", couleurTrai);
        if (couleur != null)
        {
            couleurTrai = couleur;
            repaint();
        }
        
    }//GEN-LAST:event_traitActionPerformed

    private void typeAffichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAffichActionPerformed
        // action type d'affichage
        typeAffichage ++;
        if(typeAffichage > 3)
        {
            typeAffichage = 1;
        }
        peupler();
    }//GEN-LAST:event_typeAffichActionPerformed
    
    private void sauvGEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauvGEDActionPerformed
        // action sur sauver GED
        GestionFichierGed traitementGed = new GestionFichierGed ();
        if(arbre != null)
        {
            if(traitementGed.ecrireFichierGest(arbre))
            {
                JOptionPane.showMessageDialog(null, "Fichier saugegardé");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Un problème est survenu lors de la sauvegarde du fichier");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Pas de données à sauvegarder");
        }
    }//GEN-LAST:event_sauvGEDActionPerformed

    private void resetCouleurSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCouleurSpecialActionPerformed
        // action sur reset des couleurs spéciales
        resetCouleurSpecial();
        repaint();
    }//GEN-LAST:event_resetCouleurSpecialActionPerformed

    private void typeAffichHoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAffichHoriActionPerformed
        if (verticalAffichage)
        {
            verticalAffichage = false;
        }
        else
        {
            verticalAffichage = true;
        }
        peupler();
    }//GEN-LAST:event_typeAffichHoriActionPerformed
    
    private void resetCouleurSpecial() {
        if( mapCouleurSpecial != null) {
            mapCouleurSpecial.clear();
            mapCouleurSpecial = null;
        }
        mapCouleurSpecial = new HashMap <Integer, Color>();
    }
    
    public void addCouleurSpecial(Integer in, Color co)
    {
        mapCouleurSpecial.put(in, co);
    }
    
    public void setIdCourant(Integer idCourant) {
        this.idCourant = idCourant;
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D cdc = (Graphics2D) g;

        cdc.drawLine(0,0,10,10);

        HashMap <Integer, Rectangle> mapIcones = new HashMap <Integer, Rectangle>();

        super.paint(cdc);
        
        Component[] mesIcones = getComponents();

        Rectangle rec;
        Rectangle rec2;
        IconePersonne ico;
        Integer id;

        for (int i = 0; i < mesIcones.length; i++) {
            rec = mesIcones[i].getBounds();
            ico = (IconePersonne)mesIcones[i];
            id = ico.getNumeroID();
            mapIcones.put(id,rec);
        }

        Set<Integer> listeID = mapIcones.keySet();
        for (Iterator<Integer> it = listeID.iterator(); it.hasNext(); ) {
            Color couleurTraiID = null;
            Color couleurTraiIDtemp = null;
            id = it.next();
            rec = mapIcones.get(id);

            //recherche époux
            if (arbre.get(id).getListeTypeLiens() != null)
            {
                
                for (int ind = 0; ind < arbre.get(id).getListeTypeLiens().size(); ind++)
                {
                    if (arbre.get(id).getListeTypeLiens().get(ind).getType() == 2) 
                    {
                        //recherche couleur individu
                        couleurTraiID = getCouleurId(arbre.get(id).getListeTypeLiens().get(ind).getAvecPersonne());
                        couleurTraiIDtemp = getCouleurId(id);
                        if (couleurTraiIDtemp != null)
                        {
                            couleurTraiID = couleurTraiIDtemp;
                        }
                        if (couleurTraiID == null)
                        {
                            couleurTraiID = couleurTrai;
                        }

                        rec2 = mapIcones.get(arbre.get(id).getListeTypeLiens().get(ind).getAvecPersonne());
                        if (rec2 != null)
                        {
                            cdc.setColor(couleurTraiID);
                            if (verticalAffichage)
                            {
                            cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 10 ,rec2.x + rec2.width / 2  ,rec2.y + rec2.height - 6 );
                                cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 6  ,rec.x + rec.width / 2    ,rec.y + rec.height - 6   );
                                cdc.drawLine(rec.x + rec.width / 2   ,rec.y + rec.height - 6    ,rec.x + rec.width / 2    ,rec.y + rec.height - 10  );
                        }
                            else
                            {
                                cdc.drawLine(rec2.x + rec2.width - 10,rec2.y + rec2.height / 2 ,rec2.x + rec2.width - 6 ,rec2.y + rec2.height / 2 );
                                cdc.drawLine(rec2.x + rec2.width - 6 ,rec2.y + rec2.height / 2 ,rec.x + rec.width - 6   ,rec.y + rec.height / 2   );
                                cdc.drawLine(rec.x + rec.width - 6   ,rec.y + rec.height / 2   ,rec.x + rec.width - 10  ,rec.y + rec.height / 2   );
                            }
                        }
                    }
                }
            }

            Integer pere = null;
            Integer mere = null;
            if (arbre.get(id).getListeTypeLiens() != null) {
                for (int ind = 0; ind < arbre.get(id).getListeTypeLiens().size(); ind++)
                {
                    TypeLien lien = arbre.get(id).getListeTypeLiens().get(ind);
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
            
            //recherce couleur parents
            couleurTraiID = null;
            if (mere != null)
            {
                couleurTraiID = getCouleurId(mere);
            }
            if (pere != null)
            {
                couleurTraiIDtemp = getCouleurId(pere);
                if (couleurTraiIDtemp != null)
                {
                    couleurTraiID = couleurTraiIDtemp;
                }
            }
            if (couleurTraiID == null)
            {
                couleurTraiID = couleurTrai;
            }
            
            //recherche père
            if (pere != null){

                rec2 = mapIcones.get(pere);
                if (rec2 != null)
                {
                    cdc.setColor(couleurTraiID);
                    if (verticalAffichage)
                    {
                    cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 10 ,rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 6);
                    cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 6  ,rec.x + rec.width / 2   ,rec2.y + rec2.height - 6);
                    cdc.drawLine(rec.x + rec.width / 2   ,rec2.y + rec2.height - 6  ,rec.x + rec.width / 2   ,rec.y                   );
                }
                    else
                    {
                        cdc.drawLine(rec2.x + rec2.width - 10,rec2.y + rec2.height / 2 ,rec2.x + rec2.width - 6 ,rec2.y + rec2.height / 2);
                        cdc.drawLine(rec2.x + rec2.width - 6 ,rec2.y + rec2.height / 2 ,rec2.x + rec2.width - 6 ,rec.y + rec.height / 2  );
                        cdc.drawLine(rec2.x + rec2.width - 6 ,rec.y + rec.height / 2   ,rec.x                   ,rec.y  + rec.height / 2 );
                    }
                }
            }

            //recherche mère
            if (mere != null){

                rec2 = mapIcones.get(mere);
                if (rec2 != null)
                {
                    cdc.setColor(couleurTraiID);
                    if (verticalAffichage)
                    {
                    cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 10 ,rec2.x + rec2.width / 2  ,rec2.y + rec2.height - 6 );
                    cdc.drawLine(rec2.x + rec2.width / 2 ,rec2.y + rec2.height - 6  ,rec.x + rec.width / 2    ,rec2.y + rec2.height - 6 );
                    cdc.drawLine(rec.x + rec.width / 2   ,rec2.y + rec2.height - 6  ,rec.x + rec.width / 2    ,rec.y                    );
                }
                    else
                    {
                        cdc.drawLine(rec2.x + rec2.width - 10 ,rec2.y + rec2.height / 2 ,rec2.x + rec2.width - 6  ,rec2.y + rec2.height / 2 );
                        cdc.drawLine(rec2.x + rec2.width - 6 ,rec2.y + rec2.height / 2  ,rec2.x + rec2.width - 6  ,rec.y + rec.height / 2   );
                        cdc.drawLine(rec2.x + rec2.width - 6 ,rec.y + rec.height / 2    ,rec.x                    ,rec.y + rec.height / 2   );
                    }
                }
            }
            
            //couleur spéciale
            //recherche couleur individu
            couleurTraiID = getCouleurId(id);
            if (couleurTraiID != null)
            {
                couleurTraiID = mapCouleurSpecial.get(id);
                cdc.setColor(couleurTraiID);
                if (verticalAffichage)
                {
                cdc.drawLine(rec.x - 1        , rec.y - 1              , rec.x + rec.width, rec.y - 1              );
                cdc.drawLine(rec.x - 1        , rec.y - 1              , rec.x - 1        , rec.y + rec.height - 10);
                cdc.drawLine(rec.x + rec.width, rec.y - 1              , rec.x + rec.width, rec.y + rec.height - 10);
                cdc.drawLine(rec.x - 1        , rec.y + rec.height - 10, rec.x + rec.width, rec.y + rec.height - 10);
            }
                else
                {
                    //TODO: a tester
                    cdc.drawLine(rec.x - 1             , rec.y - 1         , rec.x + rec.width - 10, rec.y - 1         );
                    cdc.drawLine(rec.x - 1             , rec.y - 1         , rec.x - 1             , rec.y + rec.height);
                    cdc.drawLine(rec.x + rec.width - 10, rec.y - 1         , rec.x + rec.width - 10, rec.y + rec.height);
                    cdc.drawLine(rec.x - 1             , rec.y + rec.height, rec.x + rec.width - 10, rec.y + rec.height);
                }
            }
        }
    }
    
    /**
     * 
     */
    protected void peupler() {
        //si pas d'arbre arret
        if (idCourant == -1) {
            return;
        }

        //destruction arbre existant
        this.removeAll();
        this.repaint();

        //création nouvel arbre
        switch (typeAffichage)
        {
            case 1 :
                arbre.calculAncetre(idCourant);
                break;
            case 2 :
                arbre.calculEnfant(idCourant);
                break;
            case 3 :
                arbre.calculEnfant2(idCourant);
                break;
            default:
                arbre.calculAncetre(idCourant);
                break;
        }

        //création grille pour affichage
        grille = new GridBagLayout();
        this.setLayout(grille);

        //réinitialisation zoom
        zoom = 100;
        
        //réinitialisation chaine la plus longue
        String textLePlusLong = "";
        rapportPoliceText = 1;
        rapportPoliceTextHauteur = 1;

        //mise en place des icones
        IconePersonne nouvelleIcone = null;
        Set<Integer> listeCle = arbre.getListeCle();
        for (Iterator<Integer> it = listeCle.iterator(); it.hasNext(); ) {
            Integer ident = it.next();
            Point pp = arbre.getListeGen().get(ident);
            nouvelleIcone = new IconePersonne(arbre.get(ident).getIdentite(), ident, couleurFont, typeEcriture);
            textLePlusLong =  nouvelleIcone.estTextLePusLong(textLePlusLong);//A la création sauvegarde du texte le plus long
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = GridBagConstraints.NONE;
            if (verticalAffichage)
            {
            gridBagConstraints.gridx = pp.y;
            gridBagConstraints.gridy = pp.x;
            gridBagConstraints.ipadx = nouvelleIcone.getSize().width;
            gridBagConstraints.ipady = nouvelleIcone.getSize().height + 10;
                
            }
            else
            {
                gridBagConstraints.gridx = pp.x;
                gridBagConstraints.gridy = pp.y;
                gridBagConstraints.ipadx = nouvelleIcone.getSize().width + 10;
                gridBagConstraints.ipady = nouvelleIcone.getSize().height;
            }
            
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            this.add(nouvelleIcone, gridBagConstraints);
        }
        dimIconePersonne = nouvelleIcone.getSize();
        rapportPoliceText = nouvelleIcone.getTaillePolice() / nouvelleIcone.calculelongueurTexte("_" + textLePlusLong + "_");
        rapportPoliceTextHauteur = nouvelleIcone.getTaillePolice() / (4 * nouvelleIcone.calculehauteurTexte() + 2);

        Component []mesComposants = getComponents();

        //calcul taille du text a metre en place
        int nouvelleTaillePolice;
        int taillePoliceTemporaire;
        nouvelleTaillePolice = (int) (rapportPoliceText * dimIconePersonne.width);
        taillePoliceTemporaire = (int) (rapportPoliceTextHauteur * (dimIconePersonne.height / 3));
        if (taillePoliceTemporaire < nouvelleTaillePolice)
        {
            nouvelleTaillePolice = taillePoliceTemporaire;
        }
        for (int iCpt = 0; iCpt <  mesComposants.length; iCpt ++)
        {
            IconePersonne monIcone = (IconePersonne)mesComposants[iCpt];
            monIcone.setTaillePolice(nouvelleTaillePolice);
        }

        //mise en place des trais entre les icones: voir paint
        this.repaint();
    }
    
    public Color getCouleurId(Integer id)
    {
        Color couleur;
        Color couleurtemp = null;
        
        couleur = mapCouleurSpecial.get(id);
        
        Integer pere = null;
        Integer mere = null;
        if (arbre.get(id).getListeTypeLiens() != null) {
            for (int ind = 0; ind < arbre.get(id).getListeTypeLiens().size(); ind++)
            {
                TypeLien lien = arbre.get(id).getListeTypeLiens().get(ind);
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
        
        
        if(couleur == null)
        {
            if (mere !=null)
            {
                couleur = getCouleurId(mere);
            }
            if (pere !=null)
            {
                couleurtemp = getCouleurId(pere);
                if (couleurtemp != null)
                {
                    couleur = couleurtemp;
                }
            }
        }
        return couleur;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem fondEcrant;
    private javax.swing.JPopupMenu menuClickDroit;
    private javax.swing.JMenuItem resetCouleurSpecial;
    private javax.swing.JMenuItem sauvGED;
    private javax.swing.JMenuItem trait;
    private javax.swing.JMenuItem typeAffich;
    private javax.swing.JMenuItem typeAffichHori;
    // End of variables declaration//GEN-END:variables
    // variable
    private int zoom = 100;
    private Dimension dimIconePersonne = null;
    private float rapportPoliceText;
    private float rapportPoliceTextHauteur;
    private GridBagLayout grille = null;
    private Color couleurFont = new Color(238,238,238); // couleur de 0 à 255
    private Integer idCourant = -1;
    private int typeAffichage = 1; //MAIN CHANGE TYPE AFFICHAGE 
    private Boolean verticalAffichage= true; //TODO a définir dans les instances + hautes (voir typeAffichage)
    private Arbre arbre = null;
    private StyledDocument typeEcriture = null;
    private HashMap <Integer, Color> mapCouleurSpecial = new HashMap <Integer, Color>();
    private Color couleurTrai = new Color(0,0,0);
}
