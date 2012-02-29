/**
 *
 */
package arbreGene;

import javax.swing.table.AbstractTableModel;

/**
 * @author Guillet
 *
 */
public class ModelTabPersonne extends AbstractTableModel {

    /**
    * pour sauvegarde à chaud (pas util ici)
    */
    private static final long serialVersionUID = 2859654111676828777L;

    int indice = -1;

    String[] columnNames = {"Nom",
        "Prenom",
        "sexe",
        "age",
        "date de naissance"};

    //private FPersonne[] data = null;
    //ou
    private Object[][] data = null;


    @Override
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
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
    public Object getValueAt(int ligne, int coll) {
        return data[ligne][coll];
    }

    @Override
    public void setValueAt(Object value, int ligne, int col) {
        data[ligne][col] = value;
        fireTableCellUpdated(ligne, col);
    }

    @Override
    public boolean isCellEditable(int row, int col)
    { return false; }

    public void addData(FPersonne infoPersonne) {
        indice ++;
        data[indice][0] = infoPersonne.getIdentite().getNom();
        data[indice][1] = infoPersonne.getIdentite().getPrenom();
        data[indice][2] = infoPersonne.getIdentite().getSexe();
        data[indice][3] = infoPersonne.getIdentite().getAge();
        data[indice][4] = infoPersonne.getIdentite().getDateNaissance();
        data[indice][5] = infoPersonne.getClePersonne();
    }

    public void creaData(int nbLigne) {
        data = new Object[nbLigne][getColumnCount() + 1];
        indice = -1;
    }

    public void suppData() {
        data = null;
    }

    public Integer getId(int ligne) {
        return (Integer)data[ligne][5];
    }
}
