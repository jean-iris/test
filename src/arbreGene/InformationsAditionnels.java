/**
 *
 */
package arbreGene;

import java.util.ArrayList;


/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * photo de la personne
 * commentaire sur la personne
 * liste de documents annexes avec titre
 */
public class InformationsAditionnels {

    // zone attribus
    String nomFichierPhoto;
    String commantaire;
    ArrayList <DocAnnexe> documentAnnexe;

    // zone constructeur
    /**
        * constructeur paramétré
        */
    public InformationsAditionnels(String nomFichierPhoto, String commantaire,
        ArrayList<DocAnnexe> documentAnnexe) {
        super();
        this.nomFichierPhoto = nomFichierPhoto;
        this.commantaire = commantaire;
        this.documentAnnexe = documentAnnexe;
    }

    /**
        * constructeur par d�faut
        */
    public InformationsAditionnels() {
        super();
    }

    /**
        * constructeur copie
        */
    public InformationsAditionnels(InformationsAditionnels monInfo) {
        super();
        this.nomFichierPhoto = monInfo.nomFichierPhoto;
        this.commantaire = monInfo.commantaire;
        this.documentAnnexe = monInfo.documentAnnexe;
    }



    // zone méthode

}
