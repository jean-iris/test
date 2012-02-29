/**
 *
 */
package arbreGene;

/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * un titre de document
 * un document (txt, jpg, ...)
 */
public class DocAnnexe {

    // zone attribus
    String titreDocAnnexe;
    String nomFichierDocAnnexe;

    // zone constructeur
    /**
        * constructeur paramétré
        */
    public DocAnnexe(String titreDocAnnexe, String nomFichierDocAnnexe) {
        super();
        this.titreDocAnnexe = titreDocAnnexe;
        this.nomFichierDocAnnexe = nomFichierDocAnnexe;
    }

    /**
        * constructeur par défaut
        */
    public DocAnnexe() {
        super();
    }

    /**
        * constructeur copie
        */
    public DocAnnexe(DocAnnexe maDoc) {
        super();
        this.titreDocAnnexe = maDoc.titreDocAnnexe;
        this.nomFichierDocAnnexe = maDoc.nomFichierDocAnnexe;
    }

}
