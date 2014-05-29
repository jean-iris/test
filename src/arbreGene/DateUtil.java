/**
 *
 */
package arbreGene;

import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author YOHAN V1 créé le 15/02/2010 Cette classe contient: soit une date
 * simple soit (un intervale, une liste d'indice)
 */
public class DateUtil implements Serializable {

    // zone attribus
    boolean connus = false;
    Date dateSimple = null;
    Date dateDebut = null;
    Date dateFin = null;
    Map<Date, Integer> indiceRechercheDate; //TODO revoir la structure des indices

    /**
     * @param connus
     * @param dateSimple
     * @param dateDebut
     * @param dateFin
     * @param indiceRechercheDate
     */
    // zone constructeur
    /**
     * constructeur paramétré
     */
    public DateUtil(boolean connus, Date dateSimple, Date dateDebut,
            Date dateFin, Map<Date, Integer> indiceRechercheDate) {
        super();
        this.connus = connus;
        this.dateSimple = dateSimple;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.indiceRechercheDate = indiceRechercheDate;
    }

    /**
     * constructeur par défaut
     */
    public DateUtil() {
        super();
    }

    /**
     * constructeur copie
     */
    public DateUtil(DateUtil uneDate) {
        super();
        this.connus = uneDate.connus;
        this.dateSimple = uneDate.dateSimple;
        this.dateDebut = uneDate.dateDebut;
        this.dateFin = uneDate.dateFin;
        this.indiceRechercheDate = uneDate.indiceRechercheDate;
    }

    // zone méthode
    public void remplacer(DateUtil uneDate) {
        this.connus = uneDate.connus;
        this.dateSimple = uneDate.dateSimple;
        this.dateDebut = uneDate.dateDebut;
        this.dateFin = uneDate.dateFin;
        this.indiceRechercheDate = uneDate.indiceRechercheDate;
    }

    /**
     * fourni sous forme de chaine la date si celle ci est connu, fourni la date
     * entrée si celle-ci n'est pas connu et la date de fin défini, la renvoie
     * dans les autres cas, renvoie null     *
     * @return la date saisie
     */
    public String getDate() {
        String maDate = null;
        //DateFormat dateFormatter;
        //dateFormatter = DateFormat.getDateInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        if (connus) {
            if (this.dateSimple != null) {
                maDate = formatter.format(this.dateSimple);
            }
        } else {
            if (this.dateFin != null) {
                maDate = "~" + formatter.format(this.dateFin);
            }
        }
        return maDate;
    }


    public void setDateSimple(Date dateSimple) {
        this.dateSimple = dateSimple;
    }


    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }


    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setDateConnus(String date) {
        if (date.length() != 0) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("fr", "FR"));
            try {
                this.dateSimple = df.parse(date);
            } catch (ParseException e) {
                // TODO catch exeptions fromatage date simple
                e.printStackTrace();
            }
        } else {
            this.dateSimple = null;
        }
    }

    public void setDateDebut(String date) {
        if (date.length() != 0) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("fr", "FR"));
            try {
                this.dateDebut = df.parse(date);
            } catch (ParseException e) {
                // TODO catch exeptions formatage date début
                e.printStackTrace();
            }
        } else {
            this.dateDebut = null;
        }
    }

    public void setDateFin(String date) {
        if (date.length() != 0) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("fr", "FR"));
            try {
                this.dateFin = df.parse(date);
            } catch (ParseException e) {
                // TODO catch exeptions formatage date fin
                e.printStackTrace();
            }
        } else {
            this.dateFin = null;
        }
    }

    /**
     * @return connus
     */
    public boolean isConnus() {
        return connus;
    }

    /**
     * @param connus connus à définir
     */
    public void setConnus(boolean connus) {
        this.connus = connus;
    }

    /**
     * @return dateDebut
     */
    public String getDateDebut() {
        if (dateDebut != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.dateDebut);
        }
        return null;
    }

    public Date getDateDebut2() {
        return dateDebut;
    }

    /**
     * @return dateFin
     */
    public String getDateFin() {
        if (dateFin != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.dateFin);
        }
        return null;
    }

    public Date getDateFin2() {
        return dateFin;
    }

    /**
     * @return dateSimple
     */
    public String getDateSimple() {
        if (dateSimple != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.format(this.dateSimple);
        }
        return null;
    }

    /**
     * @return dateSimple
     */
    public Date getDateSimple2() {
        return dateSimple;
    }

    /**
     * @return indiceRechercheDate
     */
    public Map<Date, Integer> getIndiceRechercheDate() {
        return indiceRechercheDate;
    }

    public String nbAnnees(Date date) {
        Calendar dateComp = GregorianCalendar.getInstance();
        Calendar maDate = GregorianCalendar.getInstance();
        String nbAnn;

        dateComp.setTime(date);
        int duree;
        if (connus) {
            if (dateSimple != null) {
                maDate.setTime(dateSimple);
                duree = dateComp.get(Calendar.YEAR) - maDate.get(Calendar.YEAR);
                maDate.set(Calendar.YEAR, dateComp.get(Calendar.YEAR));
                if (maDate.after(dateComp)) {
                    duree = Math.max(0, duree - 1);
                }
                nbAnn = String.valueOf(duree);
            } else {
                nbAnn = "inconnu";
            }
        } else {
            if (dateFin != null) {
                maDate.setTime(dateFin);
                duree = dateComp.get(Calendar.YEAR) - maDate.get(Calendar.YEAR);
                maDate.set(Calendar.YEAR, dateComp.get(Calendar.YEAR));
                if (maDate.before(dateComp)) {
                    duree = Math.max(0, duree - 1);
                }
                nbAnn = "~" + String.valueOf(duree);
            } else if (dateDebut != null) {
                maDate.setTime(dateDebut);
                duree = dateComp.get(Calendar.YEAR) - maDate.get(Calendar.YEAR);
                maDate.set(Calendar.YEAR, dateComp.get(Calendar.YEAR));
                if (maDate.before(dateComp)) {
                    duree = Math.max(0, duree - 1);
                }
                nbAnn = "~" + String.valueOf(duree);
            } else {
                nbAnn = "inconnu";
            }
        }

        return nbAnn;
    }

    public String nbAnnees(DateUtil dateDeces) {
        String nbAnn;
        if (dateDeces.isConnus()) {
            if (dateDeces.getDateSimple2() != null) {
                nbAnn = nbAnnees(dateDeces.getDateSimple2());
            } else {
                nbAnn = "inconnu";
            }
        } else {
            if (dateDeces.getDateFin2() != null) {
                nbAnn = nbAnnees(dateDeces.getDateFin2());
                if (!"inconnu".equals(nbAnn)) {
                    nbAnn = "~" + nbAnn;
                }

            } else if (dateDeces.getDateDebut2() != null) {
                nbAnn = nbAnnees(dateDeces.getDateDebut2());
                if (!"inconnu".equals(nbAnn)) {
                    nbAnn = "~" + nbAnn;
                }
            } else {
                nbAnn = "inconnu";
            }
        }

        return nbAnn;
    }
}
