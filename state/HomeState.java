package state;

/**
 * HomeState represents the default state of the TV when it is turned on.
 * In this state, the user must choose an application to view specific content.
 */
public class HomeState implements State {

    private TV tv;

    /**
     * Constructor
     * @param tv the TV context this state belongs to
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Pressing Home while already on Home indicates the current screen.
     */
    @Override
    public String pressHomeButton() {
        return "TV is already on the home screen";
    }

    /**
     * Switch from Home to Netflix and updates the TV state.
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    /**
     * Switch from Home to Hulu and updates the TV state.
     */
    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...";
    }

    /**
     * In Home state, the user is prompted to pick an app to see TV shows.
     */
    @Override
    public String pressTVButton() {
        return "Home: You must pick an app to show TV shows.";
    }

    /**
     * In Home state, the user is prompted to pick an app to show movies.
     */
    @Override
    public String pressMovieButton() {
        return "Home: You must pick an app to show movies.";
    }

    /**
     * Prevents watching content without an active application.
     */
    @Override
    public void watch(String title) {
        System.out.println("You need to enter an application like Netflix or Hulu to watch a program.");
    }
}