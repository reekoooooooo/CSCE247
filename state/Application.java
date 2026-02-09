package state;

import java.util.ArrayList;



public abstract class Application {

    protected ArrayList<String> movies;
    protected ArrayList<String> tvShows;

    public Application() {
        movies = new ArrayList<>();
        tvShows = new ArrayList<>();
    }

    public void watch(String title) {
        System.out.println("Watching: " + title);
    }

    public void displayMovies() {
        System.out.println("Movies:");
        if (movies.size() == 0) {
            System.out.println("  No movies available.");
        } else {
            for (String movie : movies) {
                System.out.println("  - " + movie);
            }
        }
    }
    
    public void displayTVShows() {
        System.out.println("TV Shows:");
        if (tvShows.size() == 0) {
            System.out.println("  No TV shows available.");
        } else {
            for (String show : tvShows) {
                System.out.println("  - " + show);
            }
        }
    }
}
