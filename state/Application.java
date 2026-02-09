package state;

import java.util.ArrayList;

/**
 * Abstract class representing a streaming application.
 * Provides storage and display logic for movies and TV shows.
 */
public abstract class Application {

    protected ArrayList<String> movies;
    protected ArrayList<String> tvShows;

    /**
     * Constructor initializes the content lists.
     */
    public Application() {
        movies = new ArrayList<>();
        tvShows = new ArrayList<>();
    }

    /**
     * Displays the list of movies.
     * Output format matches instructor requirements (no bullets).
     */
    public void displayMovies() {
        if (movies.size() == 0) {
            System.out.println("No movies available.");
        } else {
            // Iterates and prints each movie title directly
            for (String movie : movies) {
                System.out.println(movie);
            }
        }
    }
    
    /**
     * Displays the list of TV shows.
     * Output format matches instructor requirements (no bullets).
     */
    public void displayTVShows() {
        if (tvShows.size() == 0) {
            System.out.println("No TV shows available.");
        } else {
            // Iterates and prints each show title directly
            for (String show : tvShows) {
                System.out.println(show);
            }
        }
    }
}