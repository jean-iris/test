/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FenArbre.java
 *
 * Created on 11 févr. 2012, 19:51:59
 */
package visuel;

import arbreGene.Arbre;
import arbreGene.FPersonne;
import arbreGene.ModelTabPersonne;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JScrollPane;

/**
 *
 * @author jean
 */
public class FenArbre extends JScrollPane {

    /**
     * Créé nouvel arbre par défaut
     */
    public FenArbre() {

        initComponents();
    }

    /**
     * constructeur paramétré
     */
    public FenArbre(Arbre arbre) {
        super();
        this.arbre = arbre;
        this.idCourant = arbre.getRacine();
        initComponents();

        AdjustmentListener listener = new ModifScroll();
        this.getHorizontalScrollBar().addAdjustmentListener(listener);
        this.getVerticalScrollBar().addAdjustmentListener(listener);
        setIdCourant(idCourant);
    }
    
    
    public FenArbre(SplitPrincipal split, Arbre arbre){
        super();
//        principal = split;
        this.arbre = arbre;
        this.idCourant = arbre.getRacine();
        initComponents();

        AdjustmentListener listener = new ModifScroll();
        this.getHorizontalScrollBar().addAdjustmentListener(listener);
        this.getVerticalScrollBar().addAdjustmentListener(listener);
        setIdCourant(idCourant); 
        split.regenerer2(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauArbre = new visuel.PanneauDessin(arbre);

        panneauArbre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panneauArbreMousePressed(evt);
            }
        });
        panneauArbre.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                selectFen(evt);
            }
        });
        panneauArbre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panneauArbreMouseDragged(evt);
            }
        });
        panneauArbre.setLayout(new java.awt.GridBagLayout());
        setViewportView(panneauArbre);
    }// </editor-fold>//GEN-END:initComponents

//    @Override
//    public void paint(Graphics g) {
////        Container frame = getRootPane().getParent();
////        if (frame instanceof FenPrinc) {
////            FenPrinc fen = (FenPrinc) getRootPane().getParent();
////            fen.getSplitPrincipal().regenerer2(idCourant);
////        }
//        super.paint(g);
//
//    }

//    zone contrôleur
    private class ModifScroll implements AdjustmentListener {
        // This method is called whenever the value of a scrollbar is changed,
        // either by the user or programmatically.

        public void adjustmentValueChanged(AdjustmentEvent evt) {
            panneauArbre.repaint();
        }
    }

    private void panneauArbreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panneauArbreMouseDragged
        Point coorMouseCible = evt.getLocationOnScreen();
        getHorizontalScrollBar().setValue(getHorizontalScrollBar().getValue() + coorMouse.x - coorMouseCible.x);
        getVerticalScrollBar().setValue(getVerticalScrollBar().getValue() + coorMouse.y - coorMouseCible.y);
        coorMouse = coorMouseCible;
        panneauArbre.repaint();    }//GEN-LAST:event_panneauArbreMouseDragged

    private void panneauArbreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panneauArbreMousePressed
        // souris appuyé : on récupère sa position
        coorMouse = evt.getLocationOnScreen();
    }//GEN-LAST:event_panneauArbreMousePressed

    private void selectFen(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_selectFen
        // TODO add your handling code here:
//        Container frame = getRootPane().getParent();
//        if (frame instanceof FenPrinc) {
//            FenPrinc fen = (FenPrinc) getRootPane().getParent();
//            fen.getSplitPrincipal().regenerer2(this);
//        } else if (frame instanceof FenPrinc) {
//            FenPrinc fen = (FenPrinc) getRootPane().getParent();
//            fen.getSplitPrincipal().regenerer2(this);
//        }

    }//GEN-LAST:event_selectFen
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private visuel.PanneauDessin panneauArbre;
    // End of variables declaration//GEN-END:variables
    private Arbre arbre;
//    private SplitPrincipal principal = null;
    private Integer idCourant = -1;
    private Point coorMouse = null;

    
    
    public Integer getIdCourant() {
        return idCourant;
    }    
    
    public void setIdCourant(Integer idCourant) {
        this.idCourant = idCourant;
        panneauArbre.setIdCourant(idCourant);
        peupler();
    }

    /**
     * méthode de remplissage de la zone avec l'arbre centré sur l'id courant
     */
    
    
    
    private void peupler() {
        panneauArbre.peupler();
//    attention lors de la création, il n'y a pas encore d'objet visuel de créé, 
//        on ne peut donc pas accéder au parent à cet instant
//                Container frame = getRootPane().getParent();
//        if (frame instanceof FenPrinc) {
//            FenPrinc fen = (FenPrinc) getRootPane().getParent();
//            fen.getSplitPrincipal().regenerer2(idCourant);
//        }
    }

    public void remplissageData(ModelTabPersonne mod) {
        if (arbre != null) {
            Set<Integer> listeCle = arbre.getListeCleTout();
            mod.creaData(listeCle.size());
            for (Iterator<Integer> it = listeCle.iterator(); it.hasNext();) {
                Integer ident = it.next();
                mod.addData(arbre.get(ident));
            }
        } else {
            mod.suppData();
        }

    }
//    zone getter et setter

    public FPersonne getFPersonne(Integer id) {
        return arbre.get(id);
    }

    /**
     * Get the value of arbre
     *
     * @return the value of arbre
     */
    public Arbre getArbre() {
        return arbre;
    }
}
