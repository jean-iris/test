/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbreGene;

import java.io.Serializable;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "txt";
    String fichierDocAnnexe;
}
