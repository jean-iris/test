/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Guillet
 */
public class IconePersonneVide extends ModelIconePersonne {

    /**
     * Creates new form ModelIconePersonne
     */
    public IconePersonneVide() {
        initComponents();
    }
    
    public IconePersonneVide(int longueur) {
        initComponents();
        setSize(longueur,longueur);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(null);
        setMinimumSize(null);
        setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    @Override
    public Dimension getSizeIcoPer()
    {
        return getSize();
    }
    
    @Override
    public String estTextLePusLong(String chaineATester)
    {
        return chaineATester;
    }

    @Override
    public float calculelongueurTexte(String chaineLaPlusLonge)
    {
        return 0;
    }

    @Override
    public float calculehauteurTexte()
    {
        return 0;
    }

    @Override
    public int getTaillePolice()
    {
        return 0;
    }

    @Override
    public void setTaillePolice(int taillePolice){}

    @Override
    public Integer getNumeroID()
    {
        return null;
    }

    @Override
    public String getTextMax()
    {
        return null;
    }

    @Override
    public Dimension getSizeText()
    {
        return null;
    }
    
    @Override
    public int getNbLigne ()
    {
        return 0;
    }
    
    @Override
    public void setSize(int width, int height) {
        int minSize = height;
        if (width < minSize ) { minSize = width; }
        super.setSize(minSize, minSize);
        
    }

    @Override
    public void setSize(Dimension d) {
        int minSize = d.height;
        if (d.width < minSize ) { minSize = d.width; }
        super.setSize(minSize, minSize);
    }
    
}
