package state;

/**
 * HuluState represents the state of the TV when the user is using the Hulu app.
 * It follows the State interface and inherits from Application
 * to access movies and TV shows lists.
 */
public class HuluState extends Application implements State {

    private TV tv;

    /**
     * Constructor
     * @param tv the TV context this state belongs to
     */
    public HuluState(TV tv) {
        super();
        this.tv = tv;

        // Populate content for Hulu
        movies.add("Prey");
        movies.add("Palm Springs");
        movies.add("No One Will Save You");

        tvShows.add("The Bear");
        tvShows.add("The Handmaid's Tale");
        tvShows.add("Only Murders in the Building");
        tvShows.add("Futurama");
    }

    /**
     * Returns to the home screen.
     */
    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...";
    }

    /**
     * Switches from Hulu to Netflix.
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    /**
     * Confirms user is already on the Hulu app.
     */
    @Override
    public String pressHuluButton() {
        return "TV is already on Hulu";
    }

    /**
     * Displays the list of TV shows available on Hulu.
     */
    @Override
    public String pressTVButton() {
        System.out.println("\nHulu TV Shows:");
        displayTVShows();
        return "Showing Hulu TV Shows.";
    }

    /**
     * Displays the list of movies available on Hulu.
     */
    @Override
    public String pressMovieButton() {
        System.out.println("\nHulu Movies:");
        displayMovies();
        return "Showing Hulu Movies.";
    }

    /**
     * Sets the program title to watch on Hulu.
     * @param title The name of the program to watch.
     */
    @Override
    public void watch(String title) {
        System.out.println("Now Watching \"" + title + "\" on Hulu.");
    }
}