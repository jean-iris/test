package utilitaire;

public class Outils {

    /**
     *
     * @param obj
     * @param mode vaut : 1 pour tout en maj 2 pour première lettre en maj 3
     * pour formater la date
     * @return
     */
    public static String formater(String obj, int mode) {
        String modif = obj.trim();
        String result = obj.trim();
        if (modif != null && !"".equals(modif)) {
            switch (mode) {
                case 1:
                    //passage en maj
                    result = modif.toUpperCase();
                    break;
                case 2:
                    String[] tabNom = modif.split(" ");
                    //1ère lettre en maj, le reste en min
                    result = "";
                    for (int i = 0; i < tabNom.length; i++) {
                            tabNom[i] = tabNom[i].replaceFirst(".", (tabNom[i].charAt(0) + "").toUpperCase());
                            result += " " + tabNom[i];
                    }
                    break;
                case 3:
                    //date
                    System.out.println("pas implémenté"); //TODO outils de formatage a completer
                    break;
            }
        }
        return result;
    }
}
