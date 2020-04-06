package View.User;

import Controller.User.MenuUserSelect;

public class MenuUser implements MenuUserInterface{
    public static void printMenuUser() {
        System.out.println(Option1);
        System.out.println(Option2);
        System.out.println(Option3);
        System.out.println(Option4);

        String UserChoose = sc.nextLine();
        while(!MenuUserSelect.UserSelectMenu(UserChoose)){
            printMenuUser();
        }
    }
}
