/**
 *
 */
package arbreGene;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient:
 * la personne,
 * son père,
 * sa mère,
 * ses enfants,
 * ses époux(épouses)
 */
public class FPersonne implements Serializable{

    // zone attribus
    Personne identite = null;
    Integer clePersonne;
    ArrayList <TypeLien> listeTypeLiens;

    // zone constructeur
    /**
        * constructeur paramétré
        */
    public FPersonne(Integer clePersonne, Personne identite, Integer clePere, Integer cleMere,
    ArrayList <Integer> listeCleEpoux, ArrayList <Integer> listeCleEnfants) {
        super();
        this.identite = identite;
        this.clePersonne = clePersonne;
        this.listeTypeLiens = new ArrayList <TypeLien> ();
    }

    public FPersonne(Personne identite) {
        super();
        this.identite = identite;
        this.clePersonne = null;
        this.listeTypeLiens = new ArrayList <TypeLien> ();
    }

    public FPersonne(Integer clePersonne, Personne identite) {
        super();
        this.identite = identite;
        this.clePersonne = clePersonne;
        this.listeTypeLiens = new ArrayList <TypeLien> ();
    }

    /**
        * constructeur par défaut
        */
    public FPersonne() {
        super();
    }

    /**
        * constructeur copie
        */
    public FPersonne(FPersonne unePersonne){
        super();
        this.identite = unePersonne.identite;
        this.clePersonne = unePersonne.clePersonne;
        this.listeTypeLiens = unePersonne.listeTypeLiens;
    }

    public FPersonne addTypeLiens (TypeLien tyli){
        this.listeTypeLiens.add(tyli);
        return this;
    }

    public FPersonne majClePers (Integer ClePers){
        this.clePersonne = ClePers;
        return this;
    }

    public Personne getIdentite() {
        return identite;
    }

    /**
        * @return clePersonne
        */
    public Integer getClePersonne() {
        return clePersonne;
    }

    /**
        * @return listeLiens
        */
    public ArrayList<TypeLien> getListeTypeLiens() {
        return listeTypeLiens;
    }
}
