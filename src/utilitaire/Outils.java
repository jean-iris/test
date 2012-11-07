package utilitaire;

public class Outils {
    
    public String formater(String obj, int mode)
    {
        if (obj != null)
        {
            switch (mode)
            {
                case 1:
                    //passage en maj
                    obj=obj.toUpperCase();
                    break;
                case 2:
                    //1ère lettre en maj, le reste en min
                    obj=obj.toLowerCase();
                    obj=obj.replaceFirst(".",(obj.charAt(0)+"").toUpperCase());
                    break;
                case 3:
                    //date
                    System.out.println("pas implémenté"); //TODO outils de formatage a completer
                    break;
            }
        }
        return obj;
    }
}
