package Controller.Personnel;

import View.User.MenuUserInterface;

public class MenuPersonnelSelect implements MenuPersonnelSelectInterface{
    public static boolean PersonnelSelectMenu(String PersonnelChoose){
        switch (PersonnelChoose){
            case MenuUserInterface.Option1 :

            case MenuUserInterface.Option2 :

            case MenuUserInterface.Option3 :

            case MenuUserInterface.Option4:

                return true;
            default :
                System.out.println(PersonnelChooseException);
        }
        return false;
    }
}
