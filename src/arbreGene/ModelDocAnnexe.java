/**
 *
 */
package arbreGene;

import javax.swing.JPanel;

/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * un titre de document
 * un document (txt, jpg, ...)
 */
public abstract class ModelDocAnnexe {

    /**
    * constructeur par défaut
    */
    public ModelDocAnnexe() {
        super();
    }

    // zone constructeur
    /**
    * constructeur paramétré
    */
    public ModelDocAnnexe(String type, String titreDocAnnexe, Object fichierDocAnnexe) {
        super();
        this.type = type;
        this.titreDocAnnexe = titreDocAnnexe;
        this.fichierDocAnnexe = fichierDocAnnexe;
    }
    
    /**
    * constructeur copie
    */
    public ModelDocAnnexe(ModelDocAnnexe maDoc) {
        super();
        this.type = maDoc.type;
        this.titreDocAnnexe = maDoc.titreDocAnnexe;
        this.fichierDocAnnexe = maDoc.fichierDocAnnexe;
    }
    
    public abstract String getType();
    
    public abstract String getTitre();
    
    public abstract JPanel getApercu();
    
    
    // zone attribus
    String titreDocAnnexe;
    String type;
    Object fichierDocAnnexe;
}
