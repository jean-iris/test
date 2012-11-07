package arbreGene;

import java.util.ArrayList;

public class Liens {
    private ArrayList <Integer> parents; 
    private ArrayList <TypeLien> listeTypeLien;
    private ArrayList <Integer> enfants; 


    //	 zone constructeur
    /**
    * constructeur paramétré
    * @return
    */
    public Liens(Integer parent1, Integer parent2) 
    {
        super();
        this.parents = new ArrayList <Integer> ();
        this.listeTypeLien = new ArrayList <TypeLien> ();
        this.enfants = new ArrayList <Integer> ();
        parents.add(parent1);
        if (parent2 != null)
        {
            parents.add(parent2);
        }
    }

    public void addParent(Integer parent)
    {
        parents.add(parent);
    }

    public void addEnfant(Integer enfant)
    {
        enfants.add(enfant);
    }

    public void addTypeLien(String lien, DateUtil date, String lieu, int type)
    {
        listeTypeLien.add(new TypeLien(lien, date, lieu, type));
    }

    public void addTypeLien(TypeLien tyli)
    {
        listeTypeLien.add(tyli);
    }

    public boolean estParent(Integer parent)
    {
        return parents.contains(parent);
    }

    public boolean estEnfant(Integer enfant)
    {
        if (enfants == null)
        {
            return false;
        }
        return enfants.contains(enfant);
    }

    /**
    * @return enfants
    */
    public ArrayList<Integer> getEnfants() {
        return enfants;
    }

    /**
    * @return listeTypeLien
    */
    public ArrayList<TypeLien> getListeTypeLien() {
        return listeTypeLien;
    }

    /**
    * @return parents
    */
    public ArrayList<Integer> getParents() {
        return parents;
    }

}
