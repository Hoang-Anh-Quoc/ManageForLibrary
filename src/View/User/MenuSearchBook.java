package View.User;


import Controller.User.UserSearchBook;

public class MenuSearchBook implements MenuSearchBookInterface{
    public static void printMenuSearchBook(){
        System.out.println(MessageInputNameBook);
        String NameBookInput = sc.nextLine();

        System.out.println(UserSearchBook.ValueOfSearchBook(NameBookInput));
    }
}
