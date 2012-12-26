/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

import arbreGene.ModelTabPersonne;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Guillet
 */
public class FenSelect extends javax.swing.JPanel {

    /**
     * Creates new form FenSelect
     */
    public FenSelect() {
        initComponents();
        sorter = new TableRowSorter<ModelTabPersonne>((ModelTabPersonne) table.getModel());
        table.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panFiltre = new javax.swing.JPanel();
        zoneFiltre = new java.awt.TextField();
        textFiltre = new java.awt.Label();

        setLayout(new java.awt.GridLayout(2, 1));

        table.setModel(mod);
        table.setCellSelectionEnabled(true);
        table.setFillsViewportHeight(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scrollTable.setViewportView(table);

        add(scrollTable);

        zoneFiltre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                zoneFiltreKeyReleased(evt);
            }
        });

        textFiltre.setText("Filtre :");

        javax.swing.GroupLayout panFiltreLayout = new javax.swing.GroupLayout(panFiltre);
        panFiltre.setLayout(panFiltreLayout);
        panFiltreLayout.setHorizontalGroup(
            panFiltreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFiltreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoneFiltre, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        panFiltreLayout.setVerticalGroup(
            panFiltreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFiltreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFiltreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoneFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        textFiltre.getAccessibleContext().setAccessibleName("");

        add(panFiltre);
    }// </editor-fold>//GEN-END:initComponents
    
    private void zoneFiltreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zoneFiltreKeyReleased
        // nouvelle lettre entré dans zone filtre
        //FIXME: enlever distinction maj/min, si espace 2 filtre?
        String tabFiltre[] = zoneFiltre.getText().split(" ");
        ArrayList<RowFilter<Object, Object>> tabRowFilter = new ArrayList<RowFilter<Object,Object>>(tabFiltre.length);
        for (int i = 0; i < tabFiltre.length; i++) {
            tabRowFilter.add(RowFilter.regexFilter(tabFiltre[i], 0, 1, 2, 3 , 4));
        }
        sorter.setRowFilter(RowFilter.andFilter(tabRowFilter));
    }//GEN-LAST:event_zoneFiltreKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // clique sur le tableau
        int ligne = table.getSelectedRow();
        if (ligne != -1) {
            ligne = table.convertRowIndexToModel(ligne);
            Integer numeroID = mod.getId(ligne);
            FenPrinc fen = (FenPrinc)getRootPane().getParent();
            fen.getSplitPrincipal().regenerer(numeroID);
        }
    }//GEN-LAST:event_tableMouseClicked
    
    
    public ModelTabPersonne getMod() {
        return mod;
    }
    
    public void afficherTableau () {
            //supression ancien tableau
            //this.removeAll();
            //this.validate();

            //creation tableau
            //this.add(scrollTable, null);
            //this.add(panFiltre, null);
            
            this.validate();
            this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panFiltre;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable table;
    private java.awt.Label textFiltre;
    private java.awt.TextField zoneFiltre;
    // End of variables declaration//GEN-END:variables
    //variables locales
    private ModelTabPersonne mod = new ModelTabPersonne();
    TableRowSorter<ModelTabPersonne> sorter;
}
