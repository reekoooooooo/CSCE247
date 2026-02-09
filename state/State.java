package state;

/**
 * state interface is the rule book for all TV States
 * each state must implement the methods defined here
 */

public interface State {
    // button presses return a message for tv driver
    String pressHomeButton();
    String pressNetflixButton();
    String pressHuluButton();
    String pressTVButton();
    String pressMovieButton();
    
    //watching a title doesnt need to return anything
    void watch(String title);
}
