/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.FPersonne;
import java.awt.Image;
import javax.swing.ImageIcon;
import utilitaire.Outils;

/**
 *
 * @author Jean.iris
 */
public class FenInf extends javax.swing.JPanel {

    /**
     * Creates new form FenInf
     */
    public FenInf() {
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

        textNom = new javax.swing.JLabel();
        zoneNom = new javax.swing.JTextField();
        textPrenom = new javax.swing.JLabel();
        zonePrenom = new javax.swing.JTextField();
        imagePersonne = new javax.swing.JButton();
        etiSecondPrenom = new javax.swing.JLabel();
        zoneAutrePrenom = new javax.swing.JTextField();
        textDateNais = new javax.swing.JLabel();
        zoneDateNais = new javax.swing.JFormattedTextField();
        boutonDateNais = new javax.swing.JButton();
        textLieuNais = new javax.swing.JLabel();
        zoneLieuNais = new javax.swing.JTextField();
        textSex = new javax.swing.JLabel();
        listeSexe = new javax.swing.JComboBox();
        checkDeces = new javax.swing.JCheckBox();
        textDateDeces = new javax.swing.JLabel();
        zoneDateDeces = new javax.swing.JFormattedTextField();
        boutonDateDec = new javax.swing.JButton();
        textLieuDeces = new javax.swing.JLabel();
        zoneLieuDeces = new javax.swing.JTextField();
        valider = new javax.swing.JButton();
        reinitialiser = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(325, 308));
        setMinimumSize(new java.awt.Dimension(325, 308));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle"); // NOI18N
        setName(bundle.getString("FenInf.name")); // NOI18N
        setPreferredSize(new java.awt.Dimension(325, 308));

        textNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textNom.setText(bundle.getString("FenInf.textNom.text")); // NOI18N
        textNom.setName(bundle.getString("FenInf.textNom.name")); // NOI18N

        zoneNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneNom.setName(bundle.getString("FenInf.zoneNom.name")); // NOI18N
        zoneNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                evtKeyTyped(evt);
            }
        });

        textPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textPrenom.setText(bundle.getString("FenInf.textPrenom.text")); // NOI18N
        textPrenom.setName(bundle.getString("FenInf.textPrenom.name")); // NOI18N

        zonePrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zonePrenom.setName(bundle.getString("FenInf.zonePrenom.name")); // NOI18N
        zonePrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                evtKeyTyped(evt);
            }
        });

        imagePersonne.setBorder(null);
        imagePersonne.setName(bundle.getString("FenInf.imagePersonne.name")); // NOI18N

        etiSecondPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiSecondPrenom.setText(bundle.getString("FenInf.etiSecondPrenom.text")); // NOI18N
        etiSecondPrenom.setName(bundle.getString("FenInf.etiSecondPrenom.name")); // NOI18N

        zoneAutrePrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneAutrePrenom.setName(bundle.getString("FenInf.zoneAutrePrenom.name")); // NOI18N
        zoneAutrePrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                evtKeyTyped(evt);
            }
        });

        textDateNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textDateNais.setText(bundle.getString("FenInf.textDateNais.text")); // NOI18N
        textDateNais.setName(bundle.getString("FenInf.textDateNais.name")); // NOI18N

        zoneDateNais.setName(bundle.getString("FenInf.zoneDateNais.name")); // NOI18N

        boutonDateNais.setName(bundle.getString("FenInf.boutonDateNais.name")); // NOI18N
        boutonDateNais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonDateNaisActionPerformed(evt);
            }
        });

        textLieuNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLieuNais.setText(bundle.getString("FenInf.textLieuNais.text")); // NOI18N
        textLieuNais.setName(bundle.getString("FenInf.textLieuNais.name")); // NOI18N

        zoneLieuNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneLieuNais.setName(bundle.getString("FenInf.zoneLieuNais.name")); // NOI18N
        zoneLieuNais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                evtKeyTyped(evt);
            }
        });

        textSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textSex.setText(bundle.getString("FenInf.textSex.text")); // NOI18N
        textSex.setName(bundle.getString("FenInf.textSex.name")); // NOI18N

        listeSexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Homme", "Femme" }));
        listeSexe.setName(bundle.getString("FenInf.listeSexe.name")); // NOI18N
        listeSexe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listeSexeItemStateChanged(evt);
            }
        });

        checkDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDeces.setText(bundle.getString("FenInf.checkDeces.text")); // NOI18N
        checkDeces.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkDeces.setFocusable(false);
        checkDeces.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        checkDeces.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        checkDeces.setName(bundle.getString("FenInf.checkDeces.name")); // NOI18N
        checkDeces.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkDecesStateChanged(evt);
            }
        });

        textDateDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textDateDeces.setText(bundle.getString("FenInf.textDateDeces.text")); // NOI18N
        textDateDeces.setName(bundle.getString("FenInf.textDateDeces.name")); // NOI18N

        zoneDateDeces.setName(bundle.getString("FenInf.zoneDateDeces.name")); // NOI18N

        boutonDateDec.setName(bundle.getString("FenInf.boutonDateDec.name")); // NOI18N
        boutonDateDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonDateDecActionPerformed(evt);
            }
        });

        textLieuDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLieuDeces.setText(bundle.getString("FenInf.textLieuDeces.text")); // NOI18N
        textLieuDeces.setName(bundle.getString("FenInf.textLieuDeces.name")); // NOI18N

        zoneLieuDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneLieuDeces.setName(bundle.getString("FenInf.zoneLieuDeces.name")); // NOI18N
        zoneLieuDeces.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                evtKeyTyped(evt);
            }
        });

        valider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valider.setText(bundle.getString("FenInf.valider.text")); // NOI18N
        valider.setMaximumSize(new java.awt.Dimension(75, 23));
        valider.setMinimumSize(new java.awt.Dimension(75, 23));
        valider.setName(bundle.getString("FenInf.valider.name")); // NOI18N
        valider.setPreferredSize(new java.awt.Dimension(75, 23));
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        reinitialiser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reinitialiser.setText(bundle.getString("FenInf.reinitialiser.text")); // NOI18N
        reinitialiser.setName(bundle.getString("FenInf.reinitialiser.name")); // NOI18N
        reinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinitialiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPrenom))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zoneNom)
                                    .addComponent(zonePrenom))
                                .addGap(18, 18, 18)
                                .addComponent(imagePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiSecondPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zoneAutrePrenom))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textLieuNais, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoneLieuNais))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textLieuDeces, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoneLieuDeces))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(reinitialiser)
                        .addGap(56, 56, 56)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDateNais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(zoneDateNais, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDateDeces)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zoneDateDeces, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boutonDateDec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boutonDateNais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textSex)
                        .addGap(37, 37, 37)
                        .addComponent(listeSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkDeces)))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zoneNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(zonePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrenom))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etiSecondPrenom)
                    .addComponent(zoneAutrePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDateNais)
                    .addComponent(zoneDateNais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonDateNais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textLieuNais)
                    .addComponent(zoneLieuNais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSex)
                    .addComponent(listeSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDeces))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textDateDeces)
                        .addComponent(zoneDateDeces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boutonDateDec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(zoneLieuDeces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLieuDeces))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reinitialiser))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonDateNaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonDateNaisActionPerformed
        // modif date de naissance avec date picker
        PopupDate popup = new PopupDate(null, maPersonne.getIdentite().getDateUtilNaissance(), java.util.ResourceBundle.getBundle("visuel/Bundle").getString("DATE DE NAISSANCE"));
        popup.setVisible(true);
        popup.addWindowListener(new EvtDateNai());
    }//GEN-LAST:event_boutonDateNaisActionPerformed

    private void boutonDateDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonDateDecActionPerformed
        // appui sur le bouton popup date de décès prendre un date picker
        PopupDate popup = new PopupDate(null, maPersonne.getIdentite().getDateUtilDeces(), java.util.ResourceBundle.getBundle("visuel/Bundle").getString("DATE DE DÉCÈS"));
        popup.setVisible(true);
        popup.addWindowListener(new EvtDateDec());
    }//GEN-LAST:event_boutonDateDecActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        // appui sur valider
        sauvegarde();
        FenPrinc fen = (FenPrinc) getRootPane().getParent();
        fen.getSplitPrincipal().regenerer(laPersonne.getClePersonne());
    }//GEN-LAST:event_validerActionPerformed

    private void reinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinitialiserActionPerformed
        // appui sur annulé
        afficheInfoPersonne(laPersonne);
        modifie = false;
    }//GEN-LAST:event_reinitialiserActionPerformed

    private void checkDecesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkDecesStateChanged
        // appui sur check deces
        if (checkDeces.isSelected()) {
            zoneDateDeces.setVisible(true);
            zoneLieuDeces.setVisible(true);
            textDateDeces.setVisible(true);
            textLieuDeces.setVisible(true);
            boutonDateDec.setVisible(true);
        } else {
            zoneDateDeces.setVisible(false);
            zoneLieuDeces.setVisible(false);
            textDateDeces.setVisible(false);
            textLieuDeces.setVisible(false);
            boutonDateDec.setVisible(false);
        }
        repaint();
        modifie = true;
    }//GEN-LAST:event_checkDecesStateChanged

    private void listeSexeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listeSexeItemStateChanged
        // homme ou femme
        if (listeSexe.getSelectedItem().equals(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("HOMME"))) {
            ima = new ImageIcon("images généalogie/homme4.JPG").getImage(); //NOI18N

        }
        if (listeSexe.getSelectedItem().equals(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FEMME"))) {
            ima = new ImageIcon("images généalogie/femme4.JPG").getImage(); //NOI18N
        }

        if (ima != null) {
            Image ima2 = ima.getScaledInstance(imagePersonne.getWidth(), imagePersonne.getHeight(), java.awt.Image.SCALE_SMOOTH);
            imagePersonne.setIcon(new ImageIcon(ima2));
        }
        modifie = true;
    }//GEN-LAST:event_listeSexeItemStateChanged

    private void evtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_evtKeyTyped
        // modification des informations de la personne
        modifie = true;
    }//GEN-LAST:event_evtKeyTyped

    private class EvtDateNai extends java.awt.event.WindowAdapter {

        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            zoneDateNais.setText(maPersonne.getIdentite().getDateNaissance());
            modifie = true;
        }
    }

    private class EvtDateDec extends java.awt.event.WindowAdapter {

        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            zoneDateDeces.setText(maPersonne.getIdentite().getDateDeces());
            modifie = true;
        }
    }

//    zone des méthodes personnelles
    public void afficheInfoPersonne(FPersonne laPersonne) {
        this.setVisible(true);
        this.laPersonne = laPersonne;
        this.maPersonne = new FPersonne(this.laPersonne);

        zoneNom.setText(maPersonne.getIdentite().getNom());
        zonePrenom.setText(maPersonne.getIdentite().getPrenom());
        zoneAutrePrenom.setText(maPersonne.getIdentite().getAutrePrenom());
        zoneDateNais.setText(maPersonne.getIdentite().getDateNaissance());
        zoneLieuNais.setText(maPersonne.getIdentite().getLieuNaissance());
        zoneDateDeces.setText(maPersonne.getIdentite().getDateDeces());
        zoneLieuDeces.setText(maPersonne.getIdentite().getLieuDeces());
        listeSexe.setSelectedItem(maPersonne.getIdentite().getSexe());
        if (maPersonne.getIdentite().isDecede()) {
            checkDeces.setSelected(true);
            zoneDateDeces.setVisible(true);
            zoneLieuDeces.setVisible(true);
            textDateDeces.setVisible(true);
            textLieuDeces.setVisible(true);
            boutonDateDec.setVisible(true);
        } else {
            checkDeces.setSelected(false);
            zoneDateDeces.setVisible(false);
            zoneLieuDeces.setVisible(false);
            textDateDeces.setVisible(false);
            textLieuDeces.setVisible(false);
            boutonDateDec.setVisible(false);
        }

        ima = null;
        //TODO 4 si image existe dans base de données, on la prend, sinon on prend les icones standards
        if (maPersonne.getIdentite().getSexe().equals(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("HOMME"))) {
            ima = new ImageIcon("images généalogie/homme4.JPG").getImage(); //NOI18N

        }
        if (maPersonne.getIdentite().getSexe().equals(java.util.ResourceBundle.getBundle("visuel/Bundle").getString("FEMME"))) {
            ima = new ImageIcon("images généalogie/femme4.JPG").getImage(); //NOI18N
        }

        if (ima != null) {
            Image ima2 = ima.getScaledInstance(imagePersonne.getWidth(), imagePersonne.getHeight(), java.awt.Image.SCALE_SMOOTH);
            imagePersonne.setIcon(new ImageIcon(ima2));
        }
        repaint();
        modifie = false;
    }

    public void afficheInfoPersonne() {
        maPersonne = null;
        laPersonne = null;
        zoneNom.setText(""); //NOI18N
        zonePrenom.setText(""); //NOI18N
        zoneAutrePrenom.setText(""); //NOI18N
        zoneDateNais.setText(""); //NOI18N
        zoneLieuNais.setText(""); //NOI18N
        zoneDateDeces.setText(""); //NOI18N
        zoneLieuDeces.setText(""); //NOI18N
        listeSexe.setSelectedItem(""); //NOI18N
        checkDeces.setBorderPaintedFlat(false);
        zoneDateDeces.setVisible(false);
        zoneLieuDeces.setVisible(false);
        textDateDeces.setVisible(false);
        textLieuDeces.setVisible(false);
        boutonDateDec.setVisible(false);
        this.setVisible(false);
        this.repaint();
        modifie = false;
    }

    public void sauvegarde() {
        if (!maPersonne.getIdentite().isDecede()) {
            //TODO metre a null le lieu de deces et date de deces ?
        }

        laPersonne.getIdentite().remplacer(outil.formater(zoneNom.getText(), 1), outil.formater(zonePrenom.getText(),2), outil.formater(zoneAutrePrenom.getText(),2), maPersonne.getIdentite().getDateUtilNaissance(), zoneLieuNais.getText(),
                checkDeces.isSelected(), (String) listeSexe.getSelectedItem(), maPersonne.getIdentite().getDateUtilDeces(), zoneLieuDeces.getText(), null); //TODO 4 rajouter le chemin de l'image
        //mise a jours arbre affiché
        modifie = false;
    }

    // zone des méthodes métiers
//    public void modifInternational(java.util.Locale langueLocale) {
        protected void modifInternational(java.util.ResourceBundle bundle){
        // demande l'internationalisation des sous fenetres
//        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visuel/Bundle"); // NOI18N
        setName(bundle.getString("FenInf.name")); // NOI18N

        listeSexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] {bundle.getString("HOMME"),bundle.getString("FEMME") }));
        
        
        textNom.setText(bundle.getString("FenInf.textNom.text")); // NOI18N
        textNom.setName(bundle.getString("FenInf.textNom.name")); // NOI18N

        zoneNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneNom.setName(bundle.getString("FenInf.zoneNom.name")); // NOI18N

        textPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textPrenom.setText(bundle.getString("FenInf.textPrenom.text")); // NOI18N
        textPrenom.setName(bundle.getString("FenInf.textPrenom.name")); // NOI18N

        zonePrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zonePrenom.setName(bundle.getString("FenInf.zonePrenom.name")); // NOI18N

        imagePersonne.setName(bundle.getString("FenInf.imagePersonne.name")); // NOI18N

        etiSecondPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiSecondPrenom.setText(bundle.getString("FenInf.etiSecondPrenom.text")); // NOI18N
        etiSecondPrenom.setName(bundle.getString("FenInf.etiSecondPrenom.name")); // NOI18N

        zoneAutrePrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneAutrePrenom.setName(bundle.getString("FenInf.zoneAutrePrenom.name")); // NOI18N

        textDateNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textDateNais.setText(bundle.getString("FenInf.textDateNais.text")); // NOI18N
        textDateNais.setName(bundle.getString("FenInf.textDateNais.name")); // NOI18N

        zoneDateNais.setName(bundle.getString("FenInf.zoneDateNais.name")); // NOI18N

        boutonDateNais.setName(bundle.getString("FenInf.boutonDateNais.name")); // NOI18N

        textLieuNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLieuNais.setText(bundle.getString("FenInf.textLieuNais.text")); // NOI18N
        textLieuNais.setName(bundle.getString("FenInf.textLieuNais.name")); // NOI18N

        zoneLieuNais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneLieuNais.setName(bundle.getString("FenInf.zoneLieuNais.name")); // NOI18N

        textSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textSex.setText(bundle.getString("FenInf.textSex.text")); // NOI18N
        textSex.setName(bundle.getString("FenInf.textSex.name")); // NOI18N

        listeSexe.setName(bundle.getString("FenInf.listeSexe.name")); // NOI18N

        checkDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDeces.setText(bundle.getString("FenInf.checkDeces.text")); // NOI18N

        checkDeces.setName(bundle.getString("FenInf.checkDeces.name")); // NOI18N

        textDateDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textDateDeces.setText(bundle.getString("FenInf.textDateDeces.text")); // NOI18N
        textDateDeces.setName(bundle.getString("FenInf.textDateDeces.name")); // NOI18N

        zoneDateDeces.setName(bundle.getString("FenInf.zoneDateDeces.name")); // NOI18N

        boutonDateDec.setName(bundle.getString("FenInf.boutonDateDec.name")); // NOI18N

        textLieuDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textLieuDeces.setText(bundle.getString("FenInf.textLieuDeces.text")); // NOI18N
        textLieuDeces.setName(bundle.getString("FenInf.textLieuDeces.name")); // NOI18N

        zoneLieuDeces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zoneLieuDeces.setName(bundle.getString("FenInf.zoneLieuDeces.name")); // NOI18N

        valider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valider.setText(bundle.getString("FenInf.valider.text")); // NOI18N

        valider.setName(bundle.getString("FenInf.valider.name")); // NOI18N


        reinitialiser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reinitialiser.setText(bundle.getString("FenInf.reinitialiser.text")); // NOI18N
        reinitialiser.setName(bundle.getString("FenInf.reinitialiser.name")); // NOI18N 

    }
//    zone des getter et setter

    public boolean isModifie() {
        return modifie;
    }
//    zone des attributs
    private FPersonne laPersonne;
    private FPersonne maPersonne;
    private Image ima = null;
    private boolean modifie;
    private Outils outil = new Outils();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonDateDec;
    private javax.swing.JButton boutonDateNais;
    private javax.swing.JCheckBox checkDeces;
    private javax.swing.JLabel etiSecondPrenom;
    private javax.swing.JButton imagePersonne;
    private javax.swing.JComboBox listeSexe;
    private javax.swing.JButton reinitialiser;
    private javax.swing.JLabel textDateDeces;
    private javax.swing.JLabel textDateNais;
    private javax.swing.JLabel textLieuDeces;
    private javax.swing.JLabel textLieuNais;
    private javax.swing.JLabel textNom;
    private javax.swing.JLabel textPrenom;
    private javax.swing.JLabel textSex;
    private javax.swing.JButton valider;
    private javax.swing.JTextField zoneAutrePrenom;
    private javax.swing.JFormattedTextField zoneDateDeces;
    private javax.swing.JFormattedTextField zoneDateNais;
    private javax.swing.JTextField zoneLieuDeces;
    private javax.swing.JTextField zoneLieuNais;
    private javax.swing.JTextField zoneNom;
    private javax.swing.JTextField zonePrenom;
    // End of variables declaration//GEN-END:variables
}
