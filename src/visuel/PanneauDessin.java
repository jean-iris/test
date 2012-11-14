/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.Arbre;
import arbreGene.TypeLien;
import java.awt.*;
import java.util.*;
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
        initPerso();
        
    }
    
    /**
     * Creates new form PanneauDessinTemp parametré 
     */
    public PanneauDessin(Arbre arbre) {
        initComponents();
        this.arbre = arbre;
        initPerso();
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
        typeAffichArbre = new javax.swing.JMenu();
        typeAffichArbreBouton1 = new javax.swing.JRadioButtonMenuItem();
        typeAffichArbreBouton2 = new javax.swing.JRadioButtonMenuItem();
        typeAffichArbreBouton3 = new javax.swing.JRadioButtonMenuItem();
        typeAffichHori = new javax.swing.JMenuItem();
        typeIconeMenu = new javax.swing.JMenu();
        typeIconeBouton1 = new javax.swing.JRadioButtonMenuItem();
        typeIconeBouton2 = new javax.swing.JRadioButtonMenuItem();
        sauvGED = new javax.swing.JMenuItem();
        resetCouleurSpecial = new javax.swing.JMenuItem();
        groupeTypeAffichArbre = new javax.swing.ButtonGroup();
        groupeTypeIcone = new javax.swing.ButtonGroup();

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

        typeAffichArbre.setText("Changer d'affichage");

        groupeTypeAffichArbre.add(typeAffichArbreBouton1);
        typeAffichArbreBouton1.setSelected(true);
        typeAffichArbreBouton1.setText("Ancêtres");
        typeAffichArbreBouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichArbreBouton1ActionPerformed(evt);
            }
        });
        typeAffichArbre.add(typeAffichArbreBouton1);

        groupeTypeAffichArbre.add(typeAffichArbreBouton2);
        typeAffichArbreBouton2.setText("Descendents");
        typeAffichArbreBouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichArbreBouton2ActionPerformed(evt);
            }
        });
        typeAffichArbre.add(typeAffichArbreBouton2);

        groupeTypeAffichArbre.add(typeAffichArbreBouton3);
        typeAffichArbreBouton3.setText("Descendents + époux");
        typeAffichArbreBouton3.setActionCommand("Descandants + époux");
        typeAffichArbreBouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichArbreBouton3ActionPerformed(evt);
            }
        });
        typeAffichArbre.add(typeAffichArbreBouton3);

        menuClickDroit.add(typeAffichArbre);

        typeAffichHori.setText("Changer d'oriantation");
        typeAffichHori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAffichHoriActionPerformed(evt);
            }
        });
        menuClickDroit.add(typeAffichHori);

        typeIconeMenu.setText("Changer d'icone");

        groupeTypeIcone.add(typeIconeBouton1);
        typeIconeBouton1.setSelected(true);
        typeIconeBouton1.setText("Image + text");
        typeIconeBouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeIconeBouton1ActionPerformed(evt);
            }
        });
        typeIconeMenu.add(typeIconeBouton1);

        groupeTypeIcone.add(typeIconeBouton2);
        typeIconeBouton2.setText("Texte uniquement");
        typeIconeBouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeIconeBouton2ActionPerformed(evt);
            }
        });
        typeIconeMenu.add(typeIconeBouton2);

        menuClickDroit.add(typeIconeMenu);

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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * (initialisation des variables personnels)
     */
    private void initPerso()
    {
        timer = new Timer();
        maTacheDiff = new RemindTask();
        switch (typeAffichage) 
        {
            case 1:
                typeAffichArbreBouton1.setSelected(true);
                break;
            case 2:
                typeAffichArbreBouton2.setSelected(true);
                break;
            case 3:
                typeAffichArbreBouton3.setSelected(true);
                break;
            default:
                typeAffichArbreBouton1.setSelected(true);
                break;
        }
        switch (typeIcone) 
        {
            case 1:
                typeIconeBouton1.setSelected(true);
                break;
            case 2:
                typeIconeBouton2.setSelected(true);
                break;
            default:
                typeIconeBouton1.setSelected(true);
                break;
        }
    }
    
    class RemindTask extends TimerTask {

        @Override
        public void run() {
            modifZoom();
        }
        
    }

    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // evenement souris molette
        
        if (zoom >= 20 && zoom <= 600) {
            zoom -= evt.getWheelRotation() * 5;
            if (zoom < 20) { zoom = 20;}
            if (zoom > 600) { zoom = 600;}
            
            try 
            {
                timer.schedule(maTacheDiff, TIMEDIFF);
            }
            catch (IllegalStateException is)
            {
                //rien à faire
            }
        }

        
        
    }//GEN-LAST:event_formMouseWheelMoved
    
    private void modifZoom(){
        grille = (GridBagLayout) getLayout();
        
        Component[] mesComposants = getComponents();

        int nouvelleTaillePolice;
        int taillePoliceTemporaire;
        int y1 = dimIconePersonne.height;
        int y2 = y1 * zoom / 100;
        int x1 = dimIconePersonne.width;
        int x2 = x1 * zoom / 100;
        
        int y1t = dimTextIcone.height;
        int x1t = dimTextIcone.width;
        int y2t = y1t * zoom / 100;
        int x2t = x1t * zoom / 100;
        
        nouvelleTaillePolice = (int) (rapportPoliceText * x2t);
        taillePoliceTemporaire = (int) (rapportPoliceTextHauteur * y2t);
        if (taillePoliceTemporaire < nouvelleTaillePolice) {
            nouvelleTaillePolice = taillePoliceTemporaire;
        }

        for (int iCpt = 0; iCpt < mesComposants.length; iCpt++) {
            ModelIconePersonne monIcone = (ModelIconePersonne) mesComposants[iCpt];
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
        maTacheDiff = new RemindTask(); //réinitialisation du TimerTask car utilisable qu'une fois.
    }
    
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
        couleurTrai = new Color(0,0,0);
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

    private void typeAffichArbreBouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAffichArbreBouton2ActionPerformed
        typeAffichage = 2;
        peupler();
    }//GEN-LAST:event_typeAffichArbreBouton2ActionPerformed

    private void typeAffichArbreBouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAffichArbreBouton1ActionPerformed
        typeAffichage = 1;
        peupler();
    }//GEN-LAST:event_typeAffichArbreBouton1ActionPerformed

    private void typeAffichArbreBouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeAffichArbreBouton3ActionPerformed
        typeAffichage = 3;
        peupler();
    }//GEN-LAST:event_typeAffichArbreBouton3ActionPerformed

    private void typeIconeBouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeIconeBouton1ActionPerformed
        typeIcone = 1;
        peuplerGrille();
    }//GEN-LAST:event_typeIconeBouton1ActionPerformed

    private void typeIconeBouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeIconeBouton2ActionPerformed
        typeIcone = 2;
        peuplerGrille();
    }//GEN-LAST:event_typeIconeBouton2ActionPerformed
    
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
        ModelIconePersonne ico;
        Integer id;

        for (int i = 0; i < mesIcones.length; i++) {
            rec = mesIcones[i].getBounds();
            ico = (ModelIconePersonne)mesIcones[i];
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
        System.out.println("Test panneauDessin " + typeAffichage + "/" + idCourant);

        //création nouvel arbre
        switch (typeAffichage)
        {
            case 1 :
                System.out.println("Test panneauDessin 2");
                arbre.calculAncetre(idCourant);
                System.out.println("Test panneauDessin 3");
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
        peuplerGrille();
    }
    
    protected void peuplerGrille() {
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
        ModelIconePersonne nouvelleIcone = null;
        Set<Integer> listeCle = arbre.getListeCle();
        for (Iterator<Integer> it = listeCle.iterator(); it.hasNext(); ) {
            Integer ident = it.next();
            Point pp = arbre.getListeGen().get(ident);
            switch (typeIcone) {
                case 1 :
                    nouvelleIcone = new IconePersonneType1(arbre.get(ident).getIdentite(), ident, couleurFont, typeEcriture);
                    break;
                case 2 :
                    nouvelleIcone = new IconePersonneType2(arbre.get(ident).getIdentite(), ident, couleurFont, typeEcriture);
                    break;
                default:
                    nouvelleIcone = new IconePersonneType1(arbre.get(ident).getIdentite(), ident, couleurFont, typeEcriture);
                    break;
            }
            
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
        dimTextIcone =  nouvelleIcone.getSizeText();
        rapportPoliceText = nouvelleIcone.getTaillePolice() / nouvelleIcone.calculelongueurTexte("_" + textLePlusLong + "_");
        rapportPoliceTextHauteur = nouvelleIcone.getTaillePolice() / (nouvelleIcone.getNbLigne() * nouvelleIcone.calculehauteurTexte() + 2);

        Component []mesComposants = getComponents();

        //calcul taille du text a metre en place
        int nouvelleTaillePolice;
        int taillePoliceTemporaire;
        nouvelleTaillePolice = (int) (rapportPoliceText * dimTextIcone.width);
        taillePoliceTemporaire = (int) (rapportPoliceTextHauteur * dimTextIcone.height );
        if (taillePoliceTemporaire < nouvelleTaillePolice)
        {
            nouvelleTaillePolice = taillePoliceTemporaire;
        }
        for (int iCpt = 0; iCpt <  mesComposants.length; iCpt ++)
        {
            ModelIconePersonne monIcone = (ModelIconePersonne)mesComposants[iCpt];
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
    private javax.swing.ButtonGroup groupeTypeAffichArbre;
    private javax.swing.ButtonGroup groupeTypeIcone;
    private javax.swing.JPopupMenu menuClickDroit;
    private javax.swing.JMenuItem resetCouleurSpecial;
    private javax.swing.JMenuItem sauvGED;
    private javax.swing.JMenuItem trait;
    private javax.swing.JMenu typeAffichArbre;
    private javax.swing.JRadioButtonMenuItem typeAffichArbreBouton1;
    private javax.swing.JRadioButtonMenuItem typeAffichArbreBouton2;
    private javax.swing.JRadioButtonMenuItem typeAffichArbreBouton3;
    private javax.swing.JMenuItem typeAffichHori;
    private javax.swing.JRadioButtonMenuItem typeIconeBouton1;
    private javax.swing.JRadioButtonMenuItem typeIconeBouton2;
    private javax.swing.JMenu typeIconeMenu;
    // End of variables declaration//GEN-END:variables
    // variable
    private int zoom = 100;
    private Dimension dimIconePersonne = null;
    private Dimension dimTextIcone = null;
    private float rapportPoliceText;
    private float rapportPoliceTextHauteur;
    private GridBagLayout grille = null;
    private Color couleurFont = new Color(238,238,238); // couleur de 0 à 255
    private Integer idCourant = -1;
    private int typeAffichage = 1;
    private int typeIcone = 1;
    private Boolean verticalAffichage= true;
    private Arbre arbre = null;
    private StyledDocument typeEcriture = null;
    private HashMap <Integer, Color> mapCouleurSpecial = new HashMap <Integer, Color>();
    private Color couleurTrai = new Color(0,0,0);
    private Timer timer;
    private TimerTask maTacheDiff;
    private final long TIMEDIFF = 200;
    //TODO variables a définir dans les instances + hautes (class paramètres?)
}
