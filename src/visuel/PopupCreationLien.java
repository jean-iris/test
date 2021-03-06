/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.TypeLien;

/**
 *
 * @author Guillet
 */
public class PopupCreationLien extends javax.swing.JDialog {

    /**
     * Creates new form PopupCreationLien
     */
    public PopupCreationLien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public PopupCreationLien(int id, TypeLien tl1, TypeLien tl2, PopupListeLiens pll) {
        super();
        initComponents();
        modif = (tl1 != null)? true : false;
        this.setTitle("Ajout/modification lien de "+ id);
        pllParent = pll;
        tfPersonne1.setText(id + " est ");
        tfAvecPersonne2.setText(id + "");
        if (tl1 != null)
        {
            tfAvecPersonne1.setText(tl1.getAvecPersonne() + "");
            tfPersonne2.setText(tl1.getAvecPersonne() + " est ");
            switch (tl1.getType()) 
            {
                case 1: 
                    cbTypeLien1.setSelectedItem("↑");
                    cbTypeLien2.setText("↓");
                    break;
                case 2: 
                    cbTypeLien1.setSelectedItem("↔");
                    cbTypeLien2.setText("↔");
                    break;
                case 3: 
                    cbTypeLien1.setSelectedItem("↓");
                    cbTypeLien2.setText("↑");
                    break;
                default:
                    cbTypeLien1.setSelectedItem("?");
                    break;
            }
            
            tfLien1.setText(tl1.getLien());
            
            if (tl2 != null)
            {
                tfLien2.setText(tl2.getLien());
            }
        }
        else
        {
            tfAvecPersonne1.setText("");
            tfPersonne2.setText("");
            cbTypeLien1.setSelectedItem("↑");
        }
        refreshAvecPersonne();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTypeLien1 = new javax.swing.JLabel();
        txtTypeLien2 = new javax.swing.JLabel();
        cbTypeLien1 = new javax.swing.JComboBox();
        cbTypeLien2 = new javax.swing.JLabel();
        tfLien1 = new javax.swing.JTextField();
        tfLien2 = new javax.swing.JTextField();
        tfAvecPersonne1 = new javax.swing.JTextField();
        tfAvecPersonne2 = new javax.swing.JLabel();
        tfPersonne1 = new javax.swing.JLabel();
        tfPersonne2 = new javax.swing.JLabel();
        bOK = new java.awt.Button();
        bAnnu = new java.awt.Button();
        txtWarning = new javax.swing.JLabel();
        txtNomPers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        txtTypeLien1.setText("Type");

        txtTypeLien2.setText("Type");

        cbTypeLien1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "↑", "↔", "↓" }));
        cbTypeLien1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypeLien1ItemStateChanged(evt);
            }
        });

        cbTypeLien2.setText("cbtl2");

        tfLien1.setText("tfLien1");

        tfLien2.setText("tfLien2");

        tfAvecPersonne1.setText("tfAvecP1");
        tfAvecPersonne1.setMinimumSize(new java.awt.Dimension(15, 20));
        tfAvecPersonne1.setScrollOffset(4);
        tfAvecPersonne1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAvecPersonne1KeyReleased(evt);
            }
        });

        tfAvecPersonne2.setText("tfAvecP2");

        tfPersonne1.setText("tfP1");

        tfPersonne2.setText("tfP2");

        bOK.setLabel("OK");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        bAnnu.setLabel("Annuler");
        bAnnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnuActionPerformed(evt);
            }
        });

        txtWarning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtWarning.setForeground(new java.awt.Color(204, 0, 0));
        txtWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtNomPers.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTypeLien2)
                    .addComponent(txtTypeLien1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTypeLien2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPersonne2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTypeLien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPersonne1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfAvecPersonne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomPers))
                    .addComponent(tfAvecPersonne2))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(txtWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(bAnnu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTypeLien1)
                    .addComponent(cbTypeLien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAvecPersonne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPersonne1)
                    .addComponent(txtNomPers))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvecPersonne2)
                    .addComponent(tfLien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPersonne2)
                    .addComponent(cbTypeLien2)
                    .addComponent(txtTypeLien2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAnnu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void refreshAvecPersonne()
    {
        //FIXME il faut que la clé soit un numéro!!!!!!!!!!!!!!!!!!!
        tfPersonne2.setText(tfAvecPersonne1.getText());
        if (!"".equals(tfAvecPersonne1.getText()) & tfAvecPersonne1.getText() != null)
        {
            if (!pllParent.verifExistePersonne(Integer.parseInt(tfAvecPersonne1.getText())))
            {
                txtWarning.setText("ERREUR : la personne " + tfAvecPersonne1.getText() + " n'existe pas");
                txtNomPers.setText("");
                bOK.setEnabled(false);
            }
            else
            {
                txtWarning.setText("");
                txtNomPers.setText(pllParent.getNomPres(Integer.parseInt(tfAvecPersonne1.getText())));
                bOK.setEnabled(true);
            }
        }
        else
        {
            txtWarning.setText("");
            txtNomPers.setText("");
            bOK.setEnabled(false);
        }
    }
    
    private void cbTypeLien1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypeLien1ItemStateChanged
        switch (cbTypeLien1.getSelectedIndex()) 
        {
            case 0: 
                cbTypeLien2.setText("↓");
                tfLien1.setText("enfant de");
                tfLien2.setText("parent de");
                break;
            case 1: 
                cbTypeLien2.setText("↔");
                tfLien1.setText("marrié");
                tfLien2.setText("marrié");
                break;
            case 2: 
                cbTypeLien2.setText("↑");
                tfLien1.setText("parent de");
                tfLien2.setText("enfant de");
                break;
            default:
                cbTypeLien2.setText("?");
                tfLien1.setText("");
                tfLien2.setText("");
                break;
        }
    }//GEN-LAST:event_cbTypeLien1ItemStateChanged

    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed
        int t1 = 0;
        int t2 = 0;
        switch (cbTypeLien1.getSelectedIndex()) 
        {
            case 1: 
                t1 = 1;
                t2 = 3;
                break;
            case 2: 
                t1 = 2;
                t2 = 2;
                break;
            case 3: 
                t1 = 3;
                t2 = 1;
                break;
        }
        TypeLien tl1 = new TypeLien(Integer.parseInt(tfPersonne1.getText()), tfLien1.getText(), null, null, t1);
        TypeLien tl2 = new TypeLien(Integer.parseInt(tfPersonne2.getText()), tfLien2.getText(), null, null, t2);
        
        if (modif)
        {
            pllParent.Supprime();
        }
        pllParent.Ajout(tl1, tl2);
        dispose();
    }//GEN-LAST:event_bOKActionPerformed

    private void bAnnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnuActionPerformed
        dispose();
    }//GEN-LAST:event_bAnnuActionPerformed

    private void tfAvecPersonne1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAvecPersonne1KeyReleased
        refreshAvecPersonne();
    }//GEN-LAST:event_tfAvecPersonne1KeyReleased

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
            java.util.logging.Logger.getLogger(PopupCreationLien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupCreationLien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupCreationLien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupCreationLien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                PopupCreationLien dialog = new PopupCreationLien(new javax.swing.JFrame(), true);
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
    private java.awt.Button bAnnu;
    private java.awt.Button bOK;
    private javax.swing.JComboBox cbTypeLien1;
    private javax.swing.JLabel cbTypeLien2;
    private javax.swing.JTextField tfAvecPersonne1;
    private javax.swing.JLabel tfAvecPersonne2;
    private javax.swing.JTextField tfLien1;
    private javax.swing.JTextField tfLien2;
    private javax.swing.JLabel tfPersonne1;
    private javax.swing.JLabel tfPersonne2;
    private javax.swing.JLabel txtNomPers;
    private javax.swing.JLabel txtTypeLien1;
    private javax.swing.JLabel txtTypeLien2;
    private javax.swing.JLabel txtWarning;
    // End of variables declaration//GEN-END:variables

    //declaration variables
    PopupListeLiens pllParent;
    boolean modif;
}
