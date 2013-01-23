/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Guillet
 */
public class ModelTabDocAnnexe extends AbstractTableModel {
    
    String[] columnNames = {
        "Type",
        "Titre"};
    
    private ArrayList<Object[]> data = new ArrayList <Object[]> ();
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }
    
    @Override
    public int getRowCount() {
        if (data != null) {
            return data.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }
    
    @Override
    public void setValueAt(Object value, int ligne, int col) {
        data.get(ligne)[col] = value;
        fireTableCellUpdated(ligne, col);
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
    { return false; }
    
    public void addData(ModelDocAnnexe doc) {
        Object[] obj = new Object[3];
        obj[0] = doc.getType();
        obj[1] = doc.getTitre();
        obj[2] = doc;
        data.add(obj);
    }
    
    public void suppData() {
        data = null;
    }
    
    public ModelDocAnnexe getDoc(int ligne) {
        return (ModelDocAnnexe)data.get(ligne)[2];
    }
    
    public void removeRow(int ligne) {
        data.remove(ligne);
    }
    
}
