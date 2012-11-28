/**
 *
 */
package arbreGene;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * @author YOHAN
 * V1 créé le 15/02/2010
 * Cette classe contient les données d'une personne:
 * son nom
 * son prénom
 * sa date de naissance,
 * son lieu de naissance,
 * s'il est mort,
 * sa date de décès,
 * son lieu de décès,
 * liste des fichiers archives,
 * liste des epoux
 */
public class Personne implements Serializable{
    // zone attribus
    String nom;
    String prenom;
    String autrePrenom;
    DateUtil dateNaissance;
    String lieuNaissance;
    boolean decede;
    String sexe;
    DateUtil dateDeces;
    String lieuDeces;
    ImageIcon imagePersonne;
    
    //</editor-fold>
    // zone constructeur
    /**
    * constructeur paramétré
    */
    public Personne(String nom, String prenom, String autrePrenom, DateUtil dateNaissance, String lieuNaissance,
        boolean decede, String sexe, DateUtil dateDeces, String lieuDeces) {

        super();
        this.nom = nom;
        this.prenom = prenom;
        this.autrePrenom = autrePrenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.decede = decede;
        this.sexe = sexe;
        this.dateDeces = dateDeces;
        this.lieuDeces = lieuDeces;
        this.imagePersonne = null;
    }

    /**
    * constructeur par défaut
    */
    public Personne() {
        super();
        this.nom = "INCONNUE";
        this.prenom = "Inconnue";
        this.sexe = "Homme";
    }

    /**
    * constructeur copie
    */
    public Personne(Personne unePersonne) {
        super();
        this.nom = unePersonne.nom;
        this.prenom = unePersonne.prenom;
        this.autrePrenom = unePersonne.autrePrenom;
        this.dateNaissance = unePersonne.dateNaissance;
        this.lieuNaissance = unePersonne.lieuNaissance;
        this.decede = unePersonne.decede;
        this.sexe = unePersonne.sexe;
        this.dateDeces = unePersonne.dateDeces;
        this.lieuDeces = unePersonne.lieuDeces;
        this.imagePersonne = unePersonne.imagePersonne;
    }

    public void remplacer(String nom, String prenom, String autrePrenom, DateUtil dateNaissance, String lieuNaissance,
        boolean decede, String sexe, DateUtil dateDeces, String lieuDeces, ImageIcon imagePersonne) {
        this.nom = nom;
        this.prenom = prenom;
        this.autrePrenom = autrePrenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.decede = decede;
        this.sexe = sexe;
        this.dateDeces = dateDeces;
        this.lieuDeces = lieuDeces;
        this.imagePersonne = imagePersonne;
    }


    // zone méthode
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAutrePrenom() {
        return this.autrePrenom;
    }

    public String getDateNaissance() {
        if (this.dateNaissance != null) {
            return this.dateNaissance.getDate();
        }
        else {
            return " ";
        }
    }

    public DateUtil getDateUtilNaissance() {
        return this.dateNaissance;
    }

    public String getDateDeces() {
        if (this.dateDeces != null && decede) {
            return this.dateDeces.getDate();
        }
        else {
            return " ";
        }
    }

    public DateUtil getDateUtilDeces() {
        return this.dateDeces;
    }

    public String getAge() {
        String age = "inconnu";
        if (decede)
        {
            if (dateNaissance != null)
            {
                if (dateDeces != null)
                {
                    age = dateNaissance.nbAnnees(dateDeces);
                } else
                {
                    //TODO que metre dans l'age quand mort et sans date de déces?
                    age = "Décès inconnu";
                }

            }
        }else
        {
            if (dateNaissance != null)
            {
                age = dateNaissance.nbAnnees(new java.util.Date());
            }
        }

        return age;
    }

    /**
    * @return sexe
    */
    public String getSexe() {
        return sexe;
    }

    /**
    * @return lieuDeces
    */
    public String getLieuDeces() {
        return lieuDeces;
    }

    /**
    * @return lieuNaissance
    */
    public String getLieuNaissance() {
        return lieuNaissance;
    }

    /**
    * @return decede
    */
    public boolean isDecede() {
        return decede;
    }
    
    public ImageIcon getImagePersonne() {
        return imagePersonne;
    }

    public void setImagePersonne(ImageIcon imagePersonne) {
        this.imagePersonne = imagePersonne;
    }
}
