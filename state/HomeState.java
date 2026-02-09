package state;

/**
 * HomeState represents the default state of the TV when it is turned on
 * In this state, the user can choose to switch to different apps like Netflix or Hulu
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
     * Pressing Home while already on Home does nothing
     */
    @Override
    public String pressHomeButton() {
        return "You are already on the Home screen.";
    }

    /**
     * Switch from Home to Netflix
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Switching to Netflix...";
    }

    /**
     * Switch from Home to Hulu
     */
    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Switching to Hulu...";
    }

    /**
     * Home can show general TV categories (not app-specific lists)
     */
    @Override
    public String pressTVButton() {
        return "Showing Home TV categories.";
    }

    /**
     * Home can show general movie categories
     */
    @Override
    public String pressMovieButton() {
        return "Showing Home Movie categories.";
    }

    /**
     * Cannot watch content directly from Home
     */
    @Override
    public void watch(String title) {
        System.out.println("Please choose an app before watching \"" + title + "\".");
    }
}