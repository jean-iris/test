/**
 *
 */
package arbreGene;

import java.io.Serializable;
import javax.swing.JPanel;
import visuel.PopupListeDocAnnexe;

/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * un titre de document
 * un document (txt, jpg, ...)
 */
public abstract class ModelDocAnnexe implements Serializable {
    
    public abstract String getType();
    
    public abstract String getTitre();
    
    public abstract void getPopup(PopupListeDocAnnexe parent);
    
    public abstract JPanel getApercu();
    
    public abstract void setTitre(String titre);
}
