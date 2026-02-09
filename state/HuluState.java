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

        // populate movies and TV shows for the Hulu state
        movies.add("Prey");
        movies.add("Palm Springs");
        movies.add("No One Will Save You");

        tvShows.add("The Bear");
        tvShows.add("The Handmaid's Tale");
        tvShows.add("Only Murders in the Building");
        tvShows.add("Futurama");
    }

    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Returning to Home screen...";
    }

    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Switching to Netflix...";
    }

    @Override
    public String pressHuluButton() {
        return "Already on Hulu.";
    }

    @Override
    public String pressTVButton() {
        displayTVShows();
        return "Browsing Hulu TV shows.";
    }

    @Override
    public String pressMovieButton() {
        displayMovies();
        return "Browsing Hulu movies.";
    }

    /**
     * Watching content on Hulu
     */
    @Override
    public void watch(String title) {
        System.out.println("Now watching \"" + title + "\" on Hulu.");
    }
}
