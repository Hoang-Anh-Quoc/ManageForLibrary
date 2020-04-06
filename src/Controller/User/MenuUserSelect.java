package Controller.User;

import View.User.*;

public class MenuUserSelect implements MenuUserSelectInterface {

    public static boolean UserSelectMenu(String UserChoose){
        switch (UserChoose){
            case MenuUserInterface.Option1 :
                MenuSearchBook.printMenuSearchBook();
            case MenuUserInterface.Option2 :
                MenuSignin.printMenuSignin();
            case MenuUserInterface.Option3 :
                MenuForgetPassword.ForgetPassword();
            case MenuUserInterface.Option4:

                return true;
            default :
                System.out.println(UserChooseException);
        }
        return false;
    }
}
