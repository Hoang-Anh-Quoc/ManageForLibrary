package View.Personnel;

import Controller.Personnel.MenuPersonnelSelect;

public class MenuPersonnel implements MenuPersonnelInterface{
    public static void printMenuPersonnel() {
        System.out.println(Option1);
        System.out.println(Option2);
        System.out.println(Option3);
        System.out.println(Option4);

        String PersonnelChoose = sc.nextLine();
        while (!MenuPersonnelSelect.PersonnelSelectMenu(PersonnelChoose)){
            printMenuPersonnel();
        }
    }
}
