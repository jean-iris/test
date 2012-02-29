/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SplitPrincipal.java
 *
 * Created on 9 févr. 2012, 17:11:52
 */
package visuel;

import arbreGene.Arbre;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author jean
 */
public class SplitPrincipal extends JSplitPane {
 
    /** Creates new form SplitPrincipal */
    public SplitPrincipal() {
        strBundle =    strInternational;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ongletArbre = new javax.swing.JTabbedPane();
        splitDroitHaut = new javax.swing.JSplitPane();
        fenInf = new visuel.FenInf();
        splitDroitBas = new javax.swing.JSplitPane();
        fenAjoutLien = new visuel.FenAjoutLien();
        fenSelect = new visuel.FenSelect();

        setResizeWeight(0.91);
        setOneTouchExpandable(true);

        ongletArbre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ongletArbreStateChanged(evt);
            }
        });
        setLeftComponent(ongletArbre);

        splitDroitHaut.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitDroitHaut.setPreferredSize(new java.awt.Dimension(271, 224));
        splitDroitHaut.setTopComponent(fenInf);

        splitDroitBas.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitDroitBas.setResizeWeight(0.2);
        splitDroitBas.setTopComponent(fenAjoutLien);

        fenSelect.setLayout(new java.awt.GridLayout(2, 0));
        splitDroitBas.setBottomComponent(fenSelect);

        splitDroitHaut.setBottomComponent(splitDroitBas);

        setRightComponent(splitDroitHaut);
    }// </editor-fold>//GEN-END:initComponents

    private void ongletArbreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ongletArbreStateChanged
        // modif de l'onglet
        //passe avant regenerer2 (fenArbre -> SelectFen) => OK
        //TODO 1 TROP TARD?....
        if (fenInf.isModifie())
        {
            Object[] options = {java.util.ResourceBundle.getBundle(strBundle).getString("OUI"),java.util.ResourceBundle.getBundle(strBundle).getString("NON"),java.util.ResourceBundle.getBundle(strBundle).getString("CANCEL")};
            int reponse = JOptionPane.showOptionDialog(
                this,
                java.util.ResourceBundle.getBundle(strBundle).getString("VOULEZ VOUS SAUVEGARDER LES MODIFICATIONS SUR LA PERSONNE ?"),
                java.util.ResourceBundle.getBundle(strBundle).getString("SAUVEGARDE MODIFICATION?"),
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
            switch (reponse)
            {
                case JOptionPane.YES_OPTION :
                    //sauvegarde
                    fenInf.sauvegarde();
                    //contination changement onglet
                    break;
                case JOptionPane.NO_OPTION:
                    //contination changement onglet
                    break;
                default:
                    //arret changement onglet 
                    //remove ou discard evt ?
                    //TODO 1 arret changement onglet
                    break;
            }

        } else
        {
            //TODO contination changement onglet
        }
        
    }//GEN-LAST:event_ongletArbreStateChanged

    
    /* quelques méthodes de traitement */
    /**
    * Cette méthode créé un nouvel onglet
    */
    protected void nouvelOnglet() {
        panArbre = new FenArbre();
        panArbre.setName(java.util.ResourceBundle.getBundle(strBundle).getString("NOUVEAU"));
        ongletArbre.add(panArbre);
        ongletArbre.setSelectedComponent(panArbre);
        //panArbre.remplissageData(fenSelect.getMod());
        //fenSelect.afficherTableau();
	}

    protected void nouvelOnglet(Arbre arbre, String ongletNom) {
        //panArbre = new FenArbre(arbre);
        panArbre = new FenArbre(this, arbre);
        panArbre.setName(ongletNom);
        ongletArbre.add(panArbre);
        ongletArbre.setSelectedComponent(panArbre);
        //panArbre.remplissageData(fenSelect.getMod());
        //fenSelect.afficherTableau();
    }

    public void regenerer(Integer numeroID) {
        FenArbre fen = (FenArbre)ongletArbre.getSelectedComponent();
        if (fenInf.isModifie())
        {
            Object[] options = {java.util.ResourceBundle.getBundle(strBundle).getString("OUI"),java.util.ResourceBundle.getBundle(strBundle).getString("NON"),java.util.ResourceBundle.getBundle(strBundle).getString("CANCEL")};
            int reponse = JOptionPane.showOptionDialog(
                this,
                java.util.ResourceBundle.getBundle(strBundle).getString("VOULEZ VOUS SAUVEGARDER LES MODIFICATIONS SUR LA PERSONNE ?"),
                java.util.ResourceBundle.getBundle(strBundle).getString("SAUVEGARDE MODIFICATION?"),
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
            switch (reponse)
            {
                case JOptionPane.YES_OPTION :
                    //sauvegarde
                    fenInf.sauvegarde();
                    fen.setIdCourant(numeroID);
                    fenInf.afficheInfoPersonne(fen.getFPersonne(numeroID));
                    fen.remplissageData(fenSelect.getMod());
                    fenSelect.afficherTableau();
                    break;
                case JOptionPane.NO_OPTION:
                    fen.setIdCourant(numeroID);
                    fenInf.afficheInfoPersonne(fen.getFPersonne(numeroID));
                    fen.remplissageData(fenSelect.getMod());
                    fenSelect.afficherTableau();
                    break;
                default:
                    break;
            }

        } else
        {
            fen.setIdCourant(numeroID);
            fenInf.afficheInfoPersonne(fen.getFPersonne(numeroID));
            fen.remplissageData(fenSelect.getMod());
            fenSelect.afficherTableau();
        }
    }

    public void regenerer2(FenArbre fen) {
        Integer numeroID = fen.getIdCourant();
        if (numeroID == -1) {
            fenInf.afficheInfoPersonne();
        }
        else {
            fenInf.afficheInfoPersonne(fen.getFPersonne(numeroID));
        }
        fen.remplissageData(fenSelect.getMod());
        fenSelect.afficherTableau();
    }

        
//   protected void modifInternational(java.util.Locale langueLocale) {
    protected void modifInternational(java.util.ResourceBundle bundle){
//        strBundle = strInternational + "_" + langueLocale.getLanguage()+ "_" + langueLocale.getCountry();
        //  java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle", langueLocale); // NOI18N
//                java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle"); // NOI18N

        fenInf.modifInternational(bundle);

      
   }       
    
   /* setter et getter */

    public JTabbedPane getOngletArbre() {
        return ongletArbre;
    }        
    /* attributs    */
    
    private FenArbre panArbre;
    /**
    * nom du fichier de langue
    */
    private String strBundle;
    private final String strInternational = "visuel/Bundle";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private visuel.FenAjoutLien fenAjoutLien;
    private visuel.FenInf fenInf;
    private visuel.FenSelect fenSelect;
    private javax.swing.JTabbedPane ongletArbre;
    private javax.swing.JSplitPane splitDroitBas;
    private javax.swing.JSplitPane splitDroitHaut;
    // End of variables declaration//GEN-END:variables
}
