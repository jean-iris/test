/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visuel;

/**
 *
 * @author Guillet
 */
public class ApercuDocAnnexeTxt extends javax.swing.JPanel {

    /**
     * Creates new form ApercuDocAnnexeTxt
     */
    public ApercuDocAnnexeTxt() {
        initComponents();
    }

    public ApercuDocAnnexeTxt(String fichierDocAnnexe) {
        initComponents();
        zoneTxt.setText(fichierDocAnnexe);
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
        zoneTxt = new javax.swing.JTextArea();

        zoneTxt.setEditable(false);
        zoneTxt.setColumns(20);
        zoneTxt.setRows(5);
        jScrollPane1.setViewportView(zoneTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea zoneTxt;
    // End of variables declaration//GEN-END:variables
}
