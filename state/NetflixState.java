package state;

/**
 * NetflixState represents the state of the TV when the user is using the Netflix app.
 * It follows the State interface and inherits from Application to access content lists.
 */
public class NetflixState extends Application implements State {
    
    private TV tv;

    /**
     * Constructor populates Netflix-specific content and sets the TV context.
     * @param tv The TV context this state belongs to.
     */
    public NetflixState(TV tv) {
        super();
        this.tv = tv;
        
        // Content updated to match instructor screenshot
        movies.add("The Land Before Time");
        movies.add("Frozen");
        movies.add("The Little Mermaid");
        movies.add("Ice Age");

        tvShows.add("Peppa Pig");
        tvShows.add("My Little Pony");
        tvShows.add("Garfield");
        tvShows.add("Teenage Mutant Ninja Turtles");
    }

    /**
     * Switches the TV back to the Home state.
     */
    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home Screen...";
    }

    /**
     * Confirms the user is already on the Netflix app.
     */
    @Override
    public String pressNetflixButton() {
        return "TV is already on Netflix";
    }

    /**
     * Switches the TV state to Hulu.
     */
    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...";
    }

    /**
     * Displays the Netflix TV show list with the correct header.
     */
    @Override
    public String pressTVButton() {
        System.out.println("\nNetflix TV Shows:");
        displayTVShows();
        return "Showing Netflix TV Shows.";
    }

    /**
     * Displays the Netflix movie list with the correct header.
     */
    @Override
    public String pressMovieButton() {
        System.out.println("\nNetflix Movies:");
        displayMovies();
        return "Showing Netflix Movies.";
    }

    /**
     * Prints the message for watching a specific title on Netflix.
     */
    @Override
    public void watch(String title) {
        System.out.println("Now Watching \"" + title + "\" on Netflix.");
    }
}