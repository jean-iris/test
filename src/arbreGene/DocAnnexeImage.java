/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
    public String getTitre() {
        return titreDocAnnexe;
    }

    @Override
    public JPanel getApercu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "ima";
    ImageIcon fichierDocAnnexe;
}
