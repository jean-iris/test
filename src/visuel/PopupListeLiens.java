/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.Arbre;
import arbreGene.FPersonne;
import arbreGene.ModelTabLien;
import arbreGene.TypeLien;
import java.util.ArrayList;

/**
 *
 * @author Guillet
 */
public class PopupListeLiens extends javax.swing.JDialog {

    public PopupListeLiens() {
        super();
        initComponents();
    }

    /**
     * Creates new form PopupListeLiens
     */
    public PopupListeLiens(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PopupListeLiens(int id, Arbre ar) {
        super();
        initComponents();
        idPers = id;
        arbreSauv = ar;
        fPers = new FPersonne(ar.get(id));
        this.setTitle("Liste des liens de " + fPers.getIdentite().getPrenom() + " " + fPers.getIdentite().getNom());
        
        if (fPers.getListeTypeLiens() != null) {
            for (int ind = 0; ind < fPers.getListeTypeLiens().size(); ind++)
            {
                mod.addData(ind, fPers.getListeTypeLiens().get(ind), ar.get(fPers.getListeTypeLiens().get(ind).getAvecPersonne()).getIdentite());
            }
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableLien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        boutonOK = new javax.swing.JButton();
        boutonAnnu = new javax.swing.JButton();
        boutonAjout = new javax.swing.JButton();
        boutonModif = new javax.swing.JButton();
        boutonSupp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 200));

        tableLien.setModel(mod);
        jScrollPane1.setViewportView(tableLien);

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 70));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 70));

        boutonOK.setText("Ok");
        boutonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonOKActionPerformed(evt);
            }
        });

        boutonAnnu.setText("Annuler");
        boutonAnnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnuActionPerformed(evt);
            }
        });

        boutonAjout.setText("Ajouter Lien");
        boutonAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjoutActionPerformed(evt);
            }
        });

        boutonModif.setText("Modifier Lien");
        boutonModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonModifActionPerformed(evt);
            }
        });

        boutonSupp.setText("Supprimer Lien");
        boutonSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSuppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boutonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(boutonAnnu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boutonAjout)
                        .addGap(69, 69, 69)
                        .addComponent(boutonModif)
                        .addGap(66, 66, 66)
                        .addComponent(boutonSupp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAjout)
                    .addComponent(boutonModif)
                    .addComponent(boutonSupp))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAnnu)
                    .addComponent(boutonOK))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonOKActionPerformed
        if (listeASupprimer != null)
        {
            for (int ind = 0; ind < listeASupprimer.size(); ind++)
            {
                FPersonne fpAvec = arbreSauv.get(listeASupprimer.get(ind).getAvecPersonne());
                arbreSauv.get(idPers).getListeTypeLiens().remove(listeASupprimer.get(ind));
                if (fpAvec.getListeTypeLiens() != null)
                {
                    for (int ind2 = 0; ind2 < fpAvec.getListeTypeLiens().size(); ind2++)
                    {
                        if (fpAvec.getListeTypeLiens().get(ind2).getAvecPersonne() == idPers) //FIXME ne pas supprimer tous les liens de avec personne mais selement celui correspondant
                        {
                            fpAvec.getListeTypeLiens().remove(ind2);
                        }
                    }
                }
            }
        }
        
        if (listeACreer != null) 
        {
            for (int ind = 0; ind < listeACreer.size(); ind++)
            {
                arbreSauv.get(idPers).getListeTypeLiens().add(listeACreer.get(ind)[1]);
                arbreSauv.get(listeACreer.get(ind)[0].getAvecPersonne()).getListeTypeLiens().add(listeACreer.get(ind)[1]);
            }
        }
        dispose();
    }//GEN-LAST:event_boutonOKActionPerformed

    private void boutonAnnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnuActionPerformed
        dispose();
    }//GEN-LAST:event_boutonAnnuActionPerformed

    private void boutonSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSuppActionPerformed
        Supprime ();
    }//GEN-LAST:event_boutonSuppActionPerformed

    private void boutonModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonModifActionPerformed
        // modification = supression + creation
        int select = tableLien.getSelectedRow();
        if (select != -1)
        {
            TypeLien tl1 = new TypeLien(mod.getTypeLien(select));
            TypeLien tl2 = null;
            FPersonne fpAvec = arbreSauv.get(tl1.getAvecPersonne());
            if (fpAvec.getListeTypeLiens() != null)
            {
                for (int ind2 = 0; ind2 < fpAvec.getListeTypeLiens().size(); ind2++)
                {
                    if (fpAvec.getListeTypeLiens().get(ind2).getAvecPersonne() == idPers)
                    {
                        tl2 = new TypeLien(fpAvec.getListeTypeLiens().get(ind2));
                    }
                }
            }
            
            PopupCreationLien popup = new PopupCreationLien(idPers, tl1, tl2 , this);
            popup.setVisible(true);
        }
        
    }//GEN-LAST:event_boutonModifActionPerformed

    private void boutonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjoutActionPerformed
        TypeLien tl1 = null;
        TypeLien tl2 = null;
        PopupCreationLien popup = new PopupCreationLien(idPers, tl1, tl2 , this);
        popup.setVisible(true);
        
    }//GEN-LAST:event_boutonAjoutActionPerformed
    
    public void Ajout (TypeLien tl1, TypeLien tl2) {
        if (tl1 != null)
        {
            TypeLien[] tlt = new TypeLien[2];
            tlt[0] = tl1;
            tlt[1] = tl2;
            listeACreer.add(tlt);
            mod.addData(-1, tl1, arbreSauv.get(tl1.getAvecPersonne()).getIdentite());
            mod.fireTableStructureChanged();
        }
    }
    
    public void Supprime () {
        int select = tableLien.getSelectedRow();
        int ind = mod.getId(select);
        if (ind != -1) // ancien lien existe dans l'arbre donc a supprimer
        {
            listeASupprimer.add(fPers.getListeTypeLiens().get(ind));
        }
        else // ancien lien pas encore créé dans l'arbre donc a enlever des éléments à créer
        {
            if (listeACreer != null)
            {
                for (int ind2 = 0; ind2 < listeACreer.size(); ind2++)
                {
                    if (listeACreer.get(ind2)[1] == mod.getTypeLien(select))
                    {
                        listeACreer.remove(ind2);
                    }
                }
            }
        }
        mod.removeRow(select);
        mod.fireTableStructureChanged();
    }
    
    public boolean verifExisteLien (TypeLien tl1){
        //vérifier qu'il y n'y ai qu'une sorte de lien par couple personnes/type...
        //FIXME faut il vérifier cela????? ou que warning mais non bloquant mais dans ce cas que suprimer dans les liens AvecPersonne....
        boolean verification = true;
        for (int ind = 0; ind < mod.getRowCount(); ind++)
        {
            if (mod.getTypeLien(ind).getAvecPersonne() == tl1.getAvecPersonne())
            {
                verification = false;
            }
        }
        return verification;
    }
    public boolean verifExistePersonne (int pers){
        //FIXME vérifier l'existance de la personne avec.
        return arbreSauv.getListeCleTout().contains(pers);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopupListeLiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupListeLiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupListeLiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupListeLiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                PopupListeLiens dialog = new PopupListeLiens(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAjout;
    private javax.swing.JButton boutonAnnu;
    private javax.swing.JButton boutonModif;
    private javax.swing.JButton boutonOK;
    private javax.swing.JButton boutonSupp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLien;
    // End of variables declaration//GEN-END:variables
    //variables perso
    private FPersonne fPers;
    private int idPers;
    private ModelTabLien mod = new ModelTabLien();
    private Arbre arbreSauv;
    private ArrayList <TypeLien> listeASupprimer = new ArrayList <TypeLien> ();
    private ArrayList <TypeLien[]> listeACreer = new ArrayList <TypeLien[]> ();
    
}