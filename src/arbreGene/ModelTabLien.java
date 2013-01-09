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
public class ModelTabLien  extends AbstractTableModel {

    String[] columnNames = {
        "Type",
        "Lien",
        "Personne",
        "Date",
        "Lieu"};
    
    //private Object[][] data = null;
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
    
    public void addData(int id, TypeLien typeLien, Personne per) {
        Object[] obj = new Object[7];
        switch (typeLien.getType()) 
        {
            case 1: 
                obj[0] = "↑";
                break;
            case 2: 
                obj[0] = "↔";
                break;
            case 3: 
                obj[0] = "↓";
                break;
            default:
                obj[0] = "?";
                break;
        }
        
        obj[1] = typeLien.getLien();
        obj[2] = "(" + typeLien.getAvecPersonne() + ") " + per.getNom() + " " + per.getPrenom();
        if (typeLien.getDate() != null)
        {
            obj[3] = typeLien.getDate().getDate();
        }
        obj[4] = typeLien.getLieu();
        obj[5] = id;
        obj[6] = typeLien;
        data.add(obj);
    }
    
    public void suppData() {
        data = null;
    }
    
    public Integer getId(int ligne) {
        return (Integer)data.get(ligne)[5];
    }
    
    public TypeLien getTypeLien(int ligne) {
        return (TypeLien)data.get(ligne)[6];
    }
    
    public void removeRow(int ligne) {
        data.remove(ligne);
    }
}
