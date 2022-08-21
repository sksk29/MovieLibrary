package models;

import helper.RandomDataProvider;

import java.util.*;

public class MovieLibrary {
    private static List<Movie> moviesLibrary;


    public static void fillMovieList(){

        moviesLibrary = new LinkedList<>();
        Directory RScott = new Directory("Ridley", "Scott");
        Directory BDel = new Directory("Bart", "Del");
        Directory Atoo = new Directory("Ashley", "Too");
        Directory Tcott = new Directory("Tom", "Cott");

        Actor r_Crowe = new Actor("Russel","Crowe");
        Actor o_Reed = new Actor("Oliver","Reed");
        Actor d_Jacob = new Actor("Dom","Jacob");
        Actor g_Bad = new Actor("George","Bad");
        Actor t_Tim = new Actor("Tom","Tim");
        Actor p_Pin = new Actor("Paul","Pin");

        moviesLibrary.add(new Movie("Gladiator",RScott,List.of(r_Crowe,o_Reed)));
        moviesLibrary.add(new Movie("Piot",RScott,List.of(d_Jacob,g_Bad)));
        moviesLibrary.add(new Movie("GG",RScott,List.of(d_Jacob,o_Reed)));
        moviesLibrary.add(new Movie("Tom and Shrimp",RScott,List.of(r_Crowe,p_Pin)));
        moviesLibrary.add(new Movie("Angoliada",RScott,List.of(g_Bad,o_Reed)));
        moviesLibrary.add(new Movie("Phasmo",RScott,List.of(g_Bad,r_Crowe)));
        moviesLibrary.add(new Movie("Rust",RScott,List.of(t_Tim,d_Jacob)));
        moviesLibrary.add(new Movie("Doom",RScott,List.of(t_Tim,o_Reed)));
        moviesLibrary.add(new Movie("Ukraina",RScott,List.of(p_Pin,g_Bad)));
        moviesLibrary.add(new Movie("HIMARS",RScott,List.of(p_Pin,t_Tim)));

    }
    public static List<Movie> getMoviesLibrary(){
        return moviesLibrary;

    }

    public static void getRandomMovieInforamtion(){

        System.out.println(moviesLibrary.get(RandomDataProvider.getRandomMovieIndex()));
    }
}
