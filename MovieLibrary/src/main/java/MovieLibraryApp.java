import helper.Menu;

import java.util.Scanner;

public class MovieLibraryApp {
    public static void main(String[] args) {
        Menu.welcomeMessage();
        System.out.println("Witaj uzytkowniku w apliakcji Movie library");
        while (true) {
            Menu.printMenuOption();


            Scanner scan = new Scanner(System.in);
            int userOption = scan.nextInt();

            switch (userOption) {
                case 1:
                    System.out.println("Top gun\n\n");
                    break;
                case 2:
                    System.out.println("Mission Impossible\n\n");
                    break;
                case 3:
                    System.out.println("Zamykanie apki...");
                    System.exit(1);

            }


        }
    }
}