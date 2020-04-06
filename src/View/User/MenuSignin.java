package View.User;

import Controller.User.UserSignin;

public class MenuSignin implements MenuSigninInterface{
    public static void printMenuSignin(){
        System.out.print(MessageUserName);
        String UserName = sc.nextLine();
        System.out.print(MessagePassword);
        String Password = sc.nextLine();

        UserSignin.Singin(UserName , Password);
    }
}
