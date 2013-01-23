/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;
import visuel.PopupDocAnnexeTxt;

/**
 *
 * @author Guillet
 */
public class DocAnnexeTxt extends ModelDocAnnexe implements Serializable {
    public DocAnnexeTxt() {
        super();
    }
    
    public DocAnnexeTxt(String titre, String fichier) {
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
    public void getApercu() {
        PopupDocAnnexeTxt popup = new PopupDocAnnexeTxt(this);
        popup.setVisible(true);
    }
    
    public String getDoc() {
        return fichierDocAnnexe;
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "txt";
    String fichierDocAnnexe;
}
