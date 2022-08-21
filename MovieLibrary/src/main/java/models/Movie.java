package models;

import java.util.List;

public class Movie {
    private String title;
    private Directory director;
    private List<Actor> listOfActors;


    public Movie(String title, Directory director, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.listOfActors = actors;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Directory getDirector() {
        return director;
    }

    public void setDirector(Directory director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
    private String printActorInOneLine(){
        var actorsInOneRow = new StringBuilder();
        String separator = "";
        for (Actor listOfActor : listOfActors) {
            actorsInOneRow.append(separator+listOfActor+"");
            separator = ", ";
        }
        return actorsInOneRow.toString();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", listOfActors=" + printActorInOneLine();
    }
}
