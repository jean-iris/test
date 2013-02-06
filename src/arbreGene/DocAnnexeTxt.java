/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;
import javax.swing.JPanel;
import visuel.ApercuDocAnnexeTxt;
import visuel.PopupDocAnnexeTxt;
import visuel.PopupListeDocAnnexe;

/**
 *
 * @author Guillet
 */
public class DocAnnexeTxt extends ModelDocAnnexe implements Serializable {
    public DocAnnexeTxt() {
        super();
    }
    
    public DocAnnexeTxt(PopupListeDocAnnexe parent, String titre, String fichier) {
        super();
        titreDocAnnexe = titre;
        fichierDocAnnexe = fichier;
    }
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getTitre() {
        return titreDocAnnexe;
    }

    @Override
    public void getPopup(PopupListeDocAnnexe parent) {
        PopupDocAnnexeTxt popup = new PopupDocAnnexeTxt(this, parent);
        popup.setVisible(true);
    }
    
    public String getDoc() {
        return fichierDocAnnexe;
    }
    
    @Override
    public JPanel getApercu() {
        return new ApercuDocAnnexeTxt(fichierDocAnnexe);
    }
    
    @Override
    public void setTitre(String titre) {
        titreDocAnnexe = titre;
    }

    public void setDoc(String txt) {
        fichierDocAnnexe = txt;
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "txt";
    String fichierDocAnnexe;
}
