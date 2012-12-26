package utilitaire;

public class Outils {
    
    public String formater(String obj, int mode)
    {
        if (obj != null && !"".equals(obj))
        {
            switch (mode)
            {
                case 1:
                    //passage en maj
                    obj=obj.toUpperCase();
                    break;
                case 2:
                    //1ère lettre en maj, le reste en min
                    System.out.println("test maj 1 :" + obj);
                    obj=obj.toLowerCase();
                    System.out.println("test maj 2 :" + obj);
                    obj=obj.replaceFirst(".",(obj.charAt(0)+"").toUpperCase());
                    System.out.println("test maj 3 :" + obj);
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
