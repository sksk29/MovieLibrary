import helper.Menu;
import helper.UserInputHandler;
import models.MovieLibrary;

import java.util.Scanner;

import static models.MenuOptions.*;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary.fillMovieList();

        Menu.welcomeMessage();
        System.out.println("Witaj uzytkowniku w apliakcji Movie library");
        while (true) {
            Menu.printMenuOption();


            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIES:
                    System.out.println("wylosowales film");
                    MovieLibrary.getRandomMovieInforamtion();
                    break;
                case DISPLAYACTORFROMMOVIE:
                    System.out.println("Film wedlug aktora\n\n");
                    break;
                case EXITAPPLICATION:
                    System.out.println("Zamykanie apki...");
                    System.exit(1);
                default:
                    System.out.println("Wybrales zly numer");

            }


        }
    }
}