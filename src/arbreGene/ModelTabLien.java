/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

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
    
    private Object[][] data = null;
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }
    
    @Override
    public int getRowCount() {
        if (data != null) {
            return data.length;
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
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object value, int ligne, int col) {
        data[ligne][col] = value;
        fireTableCellUpdated(ligne, col);
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
    { return false; }
    
    public void addData(TypeLien typeLien, Personne per) {
        indice ++;
        switch (typeLien.getType()) 
        {
            case 1: 
                data[indice][0] = "↑";
                break;
            case 2: 
                data[indice][0] = "↔";
                break;
            case 3: 
                data[indice][0] = "↓";
                break;
            default:
                data[indice][0] = "?";
                break;
        }
        
        data[indice][1] = typeLien.getLien();
        data[indice][2] = "(" + typeLien.getAvecPersonne() + ") " + per.getNom() + " " + per.getPrenom();
        if (typeLien.getDate() != null)
        {
            data[indice][3] = typeLien.getDate().getDate();
        }
        data[indice][4] = typeLien.getLieu();
        
    }
    
    public void suppData() {
        data = null;
    }
    
    public void creaData(int nbLigne) {
        data = new Object[nbLigne][getColumnCount() + 1];
        indice = -1;
    }
    
    //variables
    int indice = -1;
}
