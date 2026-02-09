package state;

public class NetflixState extends Application implements State {
    /**
     * Netflix state represents the state of the TV when the user is using the Netflix app
     * follows State.jave inteface anf inherits from Application.java to access movies and TV shows lists
     * @param tv
     */
    public NetflixState(TV tv) {
        super();
        // populate movies and TV shows for the Netflix state
        movies.add("The Dark Knight");
        movies.add("Pulp Fiction");
        movies.add("The Lord of the Rings");


        tvShows.add("Money Heist");
        tvShows.add("Peaky Blinders");
        tvShows.add("Narcos");
        tvShows.add("Black Mirror");
    }
    /**
     * pressing buttons in Netflix state will either keep you on the Netflix screen or switch to the respective app
     * pressing TV or Movie buttons will display the respective lists of content available on the Netflix screen
     */
    @Override
    public String pressHomeButton() {
        return "Switching to Home...";
    }
    @Override
    public String pressNetflixButton() {
        return "You are already on Netflix.";
    }
    @Override
    public String pressHuluButton() {
        return "Switching to Hulu...";
    }
    @Override
    public String pressTVButton() {
        displayTVShows();
        return "Showing Netflix TV Shows.";
    }
    @Override
    public String pressMovieButton() {
        displayMovies();
        return "Showing Netflix Movies.";
    }
    @Override
    public void watch(String title) {
        System.out.println("Now Watching \"" + title + "\" on Netflix.");
    }
    
}
