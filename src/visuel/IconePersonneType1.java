/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.Personne;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Guillet
 */
public class IconePersonneType1 extends ModelIconePersonne {

    /**
     * Creates new form IconePersonneType1
     */
    public IconePersonneType1() {
        initComponents();
        setSize(dim);
        imagePersonne.setBounds(new Rectangle(0, 0, this.getSize().width, this.getSize().height * 2 / 3));
        infoPersonne.setBounds(new Rectangle(0, (dim.height * 2 / 3) + 1, dim.width, (dim.height * 1 / 3)));
        infoPersonne.setMargin(new Insets(1, 1, 1, 1));
        infoPersonne.setFont(new Font(nomText, styleText, 7));
        setSize(dim);
    }

    /**
     * Creates new form IconePersonneType1
     */
    public IconePersonneType1(Personne identite, Integer ind, Color couleurFontIcone, StyledDocument StyledDocument) {
        this.couleurFontIcone = couleurFontIcone;
        initComponents();
        setSize(dim);
        imagePersonne.setBounds(new Rectangle(0, 0, this.getSize().width, this.getSize().height * 2 / 3));
        infoPersonne.setBounds(new Rectangle(0, (dim.height * 2 / 3) + 1, dim.width, (dim.height * 1 / 3)));
        infoPersonne.setMargin(new Insets(1, 1, 1, 1));
        infoPersonne.setFont(new Font(nomText, styleText, 7));
        String text = identite.getPrenom() + "\n" + identite.getNom() + "\n" + identite.getDateNaissance() + " - " + identite.getDateDeces() + "\nage:" + identite.getAge();
        infoPersonne.setText(text);
        nbLigne = 4;
        
        String[] textSplit = text.split("\n");
        maMetrics = getFontMetrics(infoPersonne.getFont());
        int textLongueurMax = 0;
        for (int i = 0; i < textSplit.length; i++) {
            int longueurText = maMetrics.stringWidth(textSplit[i]);
            if (longueurText > textLongueurMax) {
                textLongueurMax = maMetrics.stringWidth(textSplit[i]);
                textMax = textSplit[i];
            }
        }
        if (textLongueurMax != 0) {
            infoPersonne.setFont(infoPersonne.getFont().deriveFont(infoPersonne.getFont().getSize() * dim.width / textLongueurMax));
        }

        this.numeroID = ind;
        
        
        ima = identite.getImagePersonne();
        if (ima == null)
        {
            if ("Homme".equals(identite.getSexe())) {
                ima = new ImageIcon("images généalogie/homme4.JPG");

            }
            if ("Femme".equals(identite.getSexe())) {
                ima = new ImageIcon("images généalogie/femme4.JPG");
            }
        }

        if (ima != null) {
            Image ima2 = ima.getImage().getScaledInstance(imagePersonne.getWidth(), imagePersonne.getHeight(), java.awt.Image.SCALE_SMOOTH);
            imagePersonne.setIcon(new ImageIcon(ima2));
        }
        
        setSize(dim);
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCliqueIcone = new javax.swing.JPopupMenu();
        selectionner = new javax.swing.JMenuItem();
        couleurSpeciale = new javax.swing.JMenuItem();
        imagePersonne = new javax.swing.JButton();
        infoPersonne = new javax.swing.JTextPane();

        selectionner.setText("selectionner");
        selectionner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionnerActionPerformed(evt);
            }
        });
        menuCliqueIcone.add(selectionner);

        couleurSpeciale.setText("couleurSpeciale");
        couleurSpeciale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couleurSpecialeActionPerformed(evt);
            }
        });
        menuCliqueIcone.add(couleurSpeciale);

        setForeground(couleurFontIcone);
        setLayout(null);

        imagePersonne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePersonneMouseClicked(evt);
            }
        });
        add(imagePersonne);
        imagePersonne.setBounds(0, 0, 70, 70);

        infoPersonne.setEditable(false);
        infoPersonne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoPersonneMouseClicked(evt);
            }
        });
        add(infoPersonne);
        infoPersonne.setBounds(0, 70, 70, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void imagePersonneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePersonneMouseClicked
        // cliqué sur l'image ou le text
        if (evt.getButton() == 1) {
            FenPrinc fen = (FenPrinc) getRootPane().getParent();
            fen.getSplitPrincipal().regenerer(numeroID);
        }
        if (evt.getButton() == 3) {
            menuCliqueIcone.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_imagePersonneMouseClicked

    private void selectionnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionnerActionPerformed
        // action sur selection
        FenPrinc fen = (FenPrinc) getRootPane().getParent();
        fen.getSplitPrincipal().regenerer(numeroID);
    }//GEN-LAST:event_selectionnerActionPerformed

    private void couleurSpecialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couleurSpecialeActionPerformed
        // action sur couleur spéciale
        Color couleur = new Color(0, 0, 0);
        couleur = JColorChooser.showDialog(this, "Choix couleur background", couleur);
        PanneauDessin pan = (PanneauDessin) getParent();
        pan.addCouleurSpecial(numeroID, couleur);
        pan.repaint();
    }//GEN-LAST:event_couleurSpecialeActionPerformed

    private void infoPersonneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPersonneMouseClicked
        // cliqué sur le text
        if (evt.getButton() == 1) {
            FenPrinc fen = (FenPrinc) getRootPane().getParent();
            fen.getSplitPrincipal().regenerer(numeroID);
        }
        if (evt.getButton() == 3) {
            menuCliqueIcone.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_infoPersonneMouseClicked

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
        dim.width = width;
        dim.height = height;
        if (imagePersonne != null) {
            imagePersonne.setSize(width, height * 2 / 3);
            if (ima != null) {
                Image ima2 = ima.getImage().getScaledInstance(imagePersonne.getWidth(), imagePersonne.getHeight(), java.awt.Image.SCALE_SMOOTH);
                imagePersonne.setIcon(new ImageIcon(ima2));
            }
        }
        if (infoPersonne != null) {
            infoPersonne.setSize(width, height * 1 / 3);
            infoPersonne.setLocation(0, (height * 2 / 3) + 1);
        }
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        if (imagePersonne != null) {
            imagePersonne.setSize(d.width, d.height * 2 / 3);

            if (ima != null) {
                Image ima2 = ima.getImage().getScaledInstance(imagePersonne.getWidth(), imagePersonne.getHeight(), java.awt.Image.SCALE_SMOOTH);
                imagePersonne.setIcon(new ImageIcon(ima2));
            }
        }
        if (infoPersonne != null) {
            infoPersonne.setSize(d.width, d.height * 1 / 3);
            infoPersonne.setLocation(0, (d.height * 2 / 3) + 1);
        }
    }

    @Override
    public Dimension getSizeIcoPer() {
        return dim;
    }
    
    @Override
    public String estTextLePusLong(String chaineATester) {
        if (maMetrics.stringWidth(textMax) > maMetrics.stringWidth(chaineATester)) {
            return textMax;
        } else {
            return chaineATester;
        }
    }

    @Override
    public float calculelongueurTexte(String chaineLaPlusLonge) {
        return maMetrics.stringWidth(chaineLaPlusLonge);
    }

    @Override
    public float calculehauteurTexte() {
        return maMetrics.getHeight();
    }

    @Override
    public int getTaillePolice() {
        return infoPersonne.getFont().getSize();
    }

    @Override
    public void setTaillePolice(int taillePolice) {
        infoPersonne.setFont(new Font(nomText, styleText, taillePolice));
        maMetrics = getFontMetrics(infoPersonne.getFont());
        repaint();
    }

    @Override
    public Integer getNumeroID() {
        return numeroID;
    }

    @Override
    public String getTextMax() {
        return textMax;
    }
    
    @Override
    public Dimension getSizeText(){
        return infoPersonne.getSize();
    }
    
    @Override
    public int getNbLigne ()
    {
        return nbLigne;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem couleurSpeciale;
    private javax.swing.JButton imagePersonne;
    private javax.swing.JTextPane infoPersonne;
    private javax.swing.JPopupMenu menuCliqueIcone;
    private javax.swing.JMenuItem selectionner;
    // End of variables declaration//GEN-END:variables
    //variables locales
    private Dimension dim = new Dimension(85, 120);
    private String nomText = "Dialog";
    private int styleText = Font.PLAIN;
    private Color couleurFontIcone = new Color(238, 238, 238);
    private FontMetrics maMetrics = null;
    private String textMax = null;
    private Integer numeroID;
    private ImageIcon ima = null;
    private int nbLigne = 1;
}
