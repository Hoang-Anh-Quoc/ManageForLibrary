package View.User;

import Controller.User.UserForgetPassword;

public class MenuForgetPassword implements MenuForgetPasswordInterface {
    public static void ForgetPassword(){
        System.out.print(MessageUserNameInput);
        String UserName = sc.nextLine();

        UserForgetPassword.ForgetPassword(UserName);
    }
}
