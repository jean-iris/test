/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FenPrinc.java
 *
 * Created on 9 févr. 2012, 10:34:39
 */
package visuel;

import arbreGene.Arbre;
import java.io.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utilitaire.GestionFichierGed;

/**
 *
 * @author jean
 */
public class FenPrinc extends javax.swing.JFrame {

    /**
     * Creates new form FenPrinc
     */
    public FenPrinc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPrincipal = new visuel.SplitPrincipal();
        menu = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        nouveau = new javax.swing.JMenuItem();
        ouvrirGED = new javax.swing.JMenuItem();
        sauverGED = new javax.swing.JMenuItem();
        sauver = new javax.swing.JMenuItem();
        ouvrir = new javax.swing.JMenuItem();
        options = new javax.swing.JMenu();
        preferences = new javax.swing.JMenuItem();
        menuLangue = new javax.swing.JMenu();
        menuFrancais = new javax.swing.JMenuItem();
        menuAnglais = new javax.swing.JMenuItem();
        aide = new javax.swing.JMenu();
        aPropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle"); // NOI18N
        setTitle(bundle.getString("FenPrinc.title")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fichier.setText(bundle.getString("FenPrinc.fichier.text")); // NOI18N

        nouveau.setText(bundle.getString("FenPrinc.nouveau.text")); // NOI18N
        nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauActionPerformed(evt);
            }
        });
        fichier.add(nouveau);

        ouvrirGED.setText(bundle.getString("FenPrinc.ouvrirGED.text")); // NOI18N
        ouvrirGED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirGEDActionPerformed(evt);
            }
        });
        fichier.add(ouvrirGED);

        sauverGED.setText(bundle.getString("FenPrinc.sauverGED.text")); // NOI18N
        sauverGED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauverGEDActionPerformed(evt);
            }
        });
        fichier.add(sauverGED);

        sauver.setText(bundle.getString("FenPrinc.sauver.text")); // NOI18N
        sauver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauverActionPerformed(evt);
            }
        });
        fichier.add(sauver);

        ouvrir.setText(bundle.getString("FenPrinc.ouvrir.text")); // NOI18N
        ouvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirActionPerformed(evt);
            }
        });
        fichier.add(ouvrir);

        menu.add(fichier);

        options.setText(bundle.getString("FenPrinc.options.text")); // NOI18N

        preferences.setText(bundle.getString("FenPrinc.preferences.text")); // NOI18N
        preferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesActionPerformed(evt);
            }
        });
        options.add(preferences);

        menuLangue.setText(bundle.getString("FenPrinc.menuLangue.text")); // NOI18N

        menuFrancais.setText(bundle.getString("FenPrinc.menuFrancais.text")); // NOI18N
        menuFrancais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFrancaisActionPerformed(evt);
            }
        });
        menuLangue.add(menuFrancais);

        menuAnglais.setText(bundle.getString("FenPrinc.menuAnglais.text")); // NOI18N
        menuAnglais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnglaisActionPerformed(evt);
            }
        });
        menuLangue.add(menuAnglais);

        options.add(menuLangue);

        menu.add(options);

        aide.setText(bundle.getString("FenPrinc.aide.text")); // NOI18N

        aPropos.setText(bundle.getString("FenPrinc.aPropos.text")); // NOI18N
        aPropos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aProposActionPerformed(evt);
            }
        });
        aide.add(aPropos);

        menu.add(aide);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // fermeture de l'application
        //sauvegarde à prévoir
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void nouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauActionPerformed
        // création d'un nouvel arbre généalogique
        splitPrincipal.nouvelOnglet();
    }//GEN-LAST:event_nouveauActionPerformed

    private void ouvrirGEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirGEDActionPerformed
        //ouverture boite de dialogue recherche fichier
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(".")); //NOI18N
        //In response to a button click:
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FICHIER GED"), "ged"); //NOI18N
        fc.setFileFilter(filter);

        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String fichierGed = fc.getSelectedFile().getPath();
            String fichierGedNom = fc.getSelectedFile().getName();
            GestionFichierGed traitementGed = new GestionFichierGed();
            Arbre arbre = new Arbre();
            traitementGed.lireFichierGest(fichierGed, arbre);
            splitPrincipal.nouvelOnglet(arbre, fichierGedNom);
        } else {
            System.out.println(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FICHIER NON SELECTIONNE"));
        }


    }//GEN-LAST:event_ouvrirGEDActionPerformed

    private void sauverGEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauverGEDActionPerformed
        GestionFichierGed traitementGed = new GestionFichierGed();

        FenArbre fen = (FenArbre) splitPrincipal.getOngletArbre().getSelectedComponent();

        if (fen != null && fen.getArbre() != null) {
            if (traitementGed.ecrireFichierGest(fen.getArbre())) {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FICHIER SAUGEGARDE"));
            } else {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("visuel/Bundle").getString("UN PROBLÈME EST SURVENU LORS DE LA SAUVEGARDE DU FICHIER"));
            }
        } else {
            JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("visuel/Bundle").getString("PAS DE DONNÉES À SAUVEGARDER"));
        }
    }//GEN-LAST:event_sauverGEDActionPerformed

    private void menuFrancaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFrancaisActionPerformed
        // cas menu langue française c'est la langue par défaut
        modifInternational(new Locale("fr", "FR"));
    }//GEN-LAST:event_menuFrancaisActionPerformed

    private void menuAnglaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnglaisActionPerformed
        // TODO add your handling code here:
        modifInternational(new Locale("en", "GB"));
    }//GEN-LAST:event_menuAnglaisActionPerformed

    private void preferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferencesActionPerformed
        // modification/sauvegarde des préférences d'un utilisateur
        PopupParam popupParam = new PopupParam(null);
        popupParam.setVisible(true);
    }//GEN-LAST:event_preferencesActionPerformed

    private void aProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aProposActionPerformed
        // fenêtre traditionnelle d'à propos
        APropos aProposPopup = new APropos(null);
        aProposPopup.setVisible(true);
    }//GEN-LAST:event_aProposActionPerformed

    private void sauverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauverActionPerformed
        // sauvegarde arbre en format perso
        
        FileOutputStream fos = null;

        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "fichier GEN", "gen");
        fc.setFileFilter(filter);

        int returnVal = fc.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomFichier = fc.getSelectedFile().getPath();
            if (nomFichier.length() <= 4 || nomFichier.substring(nomFichier.length() - 4).compareTo(".gen") != 0)
            {
                nomFichier = nomFichier + ".gen";
            }
            try {
                fos = new FileOutputStream(nomFichier);
                ObjectOutputStream out = new ObjectOutputStream(fos);
                FenArbre fen = (FenArbre) splitPrincipal.getOngletArbre().getSelectedComponent();
                if (fen != null && fen.getArbre() != null) {
                    fen.getArbre().setRacine(fen.getIdCourant());
                    out.writeObject(fen.getArbre());
                } else {
                    JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("visuel/Bundle").getString("PAS DE DONNÉES À SAUVEGARDER"));
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FICHIER NON SELECTIONNE"));
        }

    }//GEN-LAST:event_sauverActionPerformed

    private void ouvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirActionPerformed

        FileInputStream fis = null;

        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "FICHIER GEN", "gen");
        fc.setFileFilter(filter);

        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String fichierGen = fc.getSelectedFile().getPath();
            String fichierGenNom = fc.getSelectedFile().getName();

            try {
                fis = new FileInputStream(fichierGen);
                ObjectInputStream in = new ObjectInputStream(fis);
                Arbre arb = (Arbre) in.readObject();
                splitPrincipal.nouvelOnglet(arb, fichierGenNom);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(FenPrinc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FICHIER NON SELECTIONNE"));
        }
    }//GEN-LAST:event_ouvrirActionPerformed

    private void modifInternational(java.util.Locale langueLocale) {
        // demande l'internationalisation des sous fenetres
        

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle", langueLocale); // NOI18N

                splitPrincipal.modifInternational(bundle);

        
        setTitle(bundle.getString("FenPrinc.title")); // NOI18N

        fichier.setText(bundle.getString("FenPrinc.fichier.text")); // NOI18N

        nouveau.setText(bundle.getString("FenPrinc.nouveau.text")); // NOI18N

        ouvrirGED.setText(bundle.getString("FenPrinc.ouvrirGED.text")); // NOI18N

        sauverGED.setText(bundle.getString("FenPrinc.sauverGED.text")); // NOI18N

        options.setText(bundle.getString("FenPrinc.options.text")); // NOI18N

        preferences.setText(bundle.getString("FenPrinc.preferences.text")); // NOI18N

        menuLangue.setText(bundle.getString("FenPrinc.menuLangue.text")); // NOI18N

        menuFrancais.setText(bundle.getString("FenPrinc.menuFrancais.text")); // NOI18N

        menuAnglais.setText(bundle.getString("FenPrinc.menuAnglais.text")); // NOI18N

        aide.setText(bundle.getString("FenPrinc.aide.text")); // NOI18N

        aPropos.setText(bundle.getString("FenPrinc.aPropos.text")); // NOI18N
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
                if ("Nimbus".equals(info.getName())) { //NOI18N
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FenPrinc().setVisible(true);
            }
        });
    }

    public SplitPrincipal getSplitPrincipal() {
        return splitPrincipal;
    }
    //zone de gette/sette
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aPropos;
    private javax.swing.JMenu aide;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAnglais;
    private javax.swing.JMenuItem menuFrancais;
    private javax.swing.JMenu menuLangue;
    private javax.swing.JMenuItem nouveau;
    private javax.swing.JMenu options;
    private javax.swing.JMenuItem ouvrir;
    private javax.swing.JMenuItem ouvrirGED;
    private javax.swing.JMenuItem preferences;
    private javax.swing.JMenuItem sauver;
    private javax.swing.JMenuItem sauverGED;
    private visuel.SplitPrincipal splitPrincipal;
    // End of variables declaration//GEN-END:variables
}