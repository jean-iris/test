/**
 *
 */
package arbreGene;

import java.io.Serializable;


/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * photo de la personne
 * commentaire sur la personne
 * liste de documents annexes avec titre
 */
public class InformationsAditionnels implements Serializable {

    // zone attribus
    String titreInfo;
    String type;
    Object document;

    // zone constructeur
    /**
    * constructeur paramétré
    */
    public InformationsAditionnels(String titreInfo, String type,
        Object document) {
        super();
        this.titreInfo = titreInfo;
        this.type = type;
        this.document = document;
    }

    /**
    * constructeur par défaut
    */
    public InformationsAditionnels() {
        super();
    }

    /**
    * constructeur copie
    */
    public InformationsAditionnels(InformationsAditionnels monInfo) {
        super();
        this.titreInfo = monInfo.titreInfo;
        this.type = monInfo.type;
        this.document = monInfo.document;
    }

    // zone méthode

}
