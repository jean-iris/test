package arbreGene;

import java.io.Serializable;

public class TypeLien implements Serializable{
    private String lien;
    private DateUtil date;
    private String lieu;
    private Integer avecPersonne;
    private int type;
    //type :
    //1 : est enfant de
    //2 : est époux de
    //3 : est parent de

    //	 zone constructeur
    /**
    * constructeur paramétré
    * @return
    */
    public TypeLien(String lien, DateUtil date, String lieu, int type)
    {
        this.avecPersonne = null;
        this.lien = lien;
        this.date = date;
        this.lieu = lieu;
        this.type = type;
    }

    /**
    * constructeur paramétré
    * @return
    */
    public TypeLien(Integer personne, String lien, DateUtil date, String lieu, int type)
    {
        this.avecPersonne = personne;
        this.lien = lien;
        this.date = date;
        this.lieu = lieu;
        this.type = type;
    }

    /**
    * constructeur copie
    * @return
    */
    public TypeLien(TypeLien tyli)
    {
        super();
        this.avecPersonne = tyli.getAvecPersonne();
        this.lien = tyli.getLien();
        this.date = tyli.getDate();
        this.lieu = tyli.getLieu();
        this.type = tyli.getType();
    }

    /**
    * constructeur copie
    * @return
    */
    public TypeLien(TypeLien tyli, Integer personne)
    {
        super();
        this.avecPersonne = personne;
        this.lien = tyli.getLien();
        this.date = tyli.getDate();
        this.lieu = tyli.getLieu();
        this.type = tyli.getType();
    }

    /**
    * constructeur paramétré
    * @return
    */
    public TypeLien(Integer personne, String lien, int type)
    {
        this.avecPersonne = personne;
        this.lien = lien;
        this.date = null;
        this.lieu = null;
        this.type = type;
    }

    /**
    * @return date
    */
    public DateUtil getDate() {
        return date;
    }


    /**
    * @param date date à définir
    */
    public void setDate(DateUtil date) {
        this.date = date;
    }


    /**
    * @return lien
    */
    public String getLien() {
        return lien;
    }


    /**
    * @param lien lien à définir
    */
    public void setLien(String lien) {
        this.lien = lien;
    }


    /**
    * @return lieu
    */
    public String getLieu() {
        return lieu;
    }


    /**
    * @param lieu lieu à définir
    */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }


    /**
    * @return avecPersonne
    */
    public Integer getAvecPersonne() {
        return avecPersonne;
    }


    /**
    * @param avecPersonne avecPersonne à définir
    */
    public void setAvecPersonne(Integer avecPersonne) {
        this.avecPersonne = avecPersonne;
    }
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public boolean estIdentique(TypeLien tyli)
    {
        boolean test1;
        boolean test2;
        boolean test3;
        if (lien != null && tyli.getLien() != null)
        {
            test1 = lien.contentEquals(tyli.getLien());
        }
        else if (lien == null && tyli.getLien() == null)
        {
            test1 = true;
        }
        else
        {
            test1 = false;
        }

        if (lieu != null && tyli.getLieu() != null)
        {
            test2 = lieu.contentEquals(tyli.getLieu());
        }
        else if (lieu == null && tyli.getLieu() == null)
        {
            test2 = true;
        }
        else
        {
            test2 = false;
        }

        if (date != null && tyli.getDate() != null)
        {
            test3 = date.getDate().contentEquals(tyli.getDate().getDate());
        }
        else if (date == null && tyli.getDate() == null)
        {
            test3 = true;
        }
        else
        {
            test3 = false;
        }

        return test1 && test2 && test3;
    }
}
