/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;
import javax.swing.JPanel;
import visuel.ApercuDocAnnexeTxt;
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
    public void getPopup() {
        PopupDocAnnexeTxt popup = new PopupDocAnnexeTxt(this);
        popup.setVisible(true);
    }
    
    public String getDoc() {
        return fichierDocAnnexe;
    }
    
    @Override
    public JPanel getApercu() {
        return new ApercuDocAnnexeTxt(fichierDocAnnexe);
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "txt";
    String fichierDocAnnexe;
}
