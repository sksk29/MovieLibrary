package helper;

import models.Actor;
import models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scan = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser(){
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];

    }
    private static int getSelectedOptionFromUser(){
        int result = getIntegerFromUser();
        scan.nextLine();
        if (result > 0 && result<MenuOptions.values().length + 1){
            return result;
        }
        else {
            System.out.println("Wybrales nie sitniejaca opcje " + result);
            System.out.println("Sprobuj jeszcze raz");
            return getSelectedOptionFromUser();
        }
    }
    private static int getIntegerFromUser(){
        while(scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Noty integer try aganin");
        }
        return scan.nextInt();
    }
    public static Actor getActorFromUser(){
        System.out.println("Podaj imie i nazwisko aktora: ");
        String[] actor = scan.nextLine().split(" ");

        return new Actor(actor[0], actor[1]);
    }
}
