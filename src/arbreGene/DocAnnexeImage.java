/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import visuel.ApercuDocAnnexeImage;
import visuel.PopupDocAnnexeImage;

/**
 *
 * @author Guillet
 */
public class DocAnnexeImage extends ModelDocAnnexe implements Serializable {
    public DocAnnexeImage() {
        super();
    }
    
    public DocAnnexeImage(String titre, ImageIcon fichier) {
        super();
        titreDocAnnexe = titre;
        fichierDocAnnexe = fichier;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void getPopup() {
        PopupDocAnnexeImage popup = new PopupDocAnnexeImage(this);
        popup.setVisible(true);
    }

    @Override
    public JPanel getApercu() {
        return new ApercuDocAnnexeImage(fichierDocAnnexe);
    }

    @Override
    public String getTitre() {
        return titreDocAnnexe;
    }
    
    public ImageIcon getDoc() {
        return fichierDocAnnexe;
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "ima";
    ImageIcon fichierDocAnnexe;
}
