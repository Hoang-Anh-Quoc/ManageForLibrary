package Controller.User;

import Module.User.SinginManagerAccount;
import Module.User.SinginPersonnelAccount;
import View.Manager.MenuManager;
import View.Personnel.MenuPersonnel;

public class UserSignin {
    public static void Singin(String UserName , String Password){
        if(SinginManagerAccount.SinginAccount(UserName , Password)){
            MenuManager.printMenuManager();
        } else if(SinginPersonnelAccount.SinginAccount(UserName , Password)){
            MenuPersonnel.printMenuPersonnel();
        } else {
            // Khong tim thay tai khoan
            System.out.println();
        }
    }
}
