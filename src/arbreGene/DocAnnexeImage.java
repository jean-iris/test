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
import visuel.PopupListeDocAnnexe;

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
    public void getPopup(PopupListeDocAnnexe parent) {
        PopupDocAnnexeImage popup = new PopupDocAnnexeImage(this, parent);
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
    
    @Override
    public void setTitre(String titre) {
        titreDocAnnexe = titre;
    }

    public void setDoc(ImageIcon ima) {
        fichierDocAnnexe = ima;
    }
    
    // zone attribus
    String titreDocAnnexe;
    String type = "ima";
    ImageIcon fichierDocAnnexe;

    
}
