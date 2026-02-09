package state;

/**
 * class representing a TV with various states
 * 
 * the TV can be in different states such as Home, Netflix, Hulu, etc.
 * each state determines the behavior of the TV when buttons are pressed
 */

public class TV {

    // states of the TV
    private State homeState;
    private State netflixState;
    private State huluState;

    // current state of the TV
    private State state;

    /**
     * constructor
     * initializes the TV and its states
     */
    public TV() {
        // create the concrete states and pass the TV context to them
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
    
    // start in Home state
        state = homeState;
    }

    /**
     * pressing home button delegates to current state
     * 
     */

    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * pressing netflix button delegates to current state
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }
    /** 
     * pressing hulu button delegates to current state 
     */ 
    public String pressHuluButton() {
        return state.pressHuluButton();
    }   
    /**
     * pressing tv button delegates to current state
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    public String pressMovieButton() {
        return state.pressMovieButton();
    }
    /**
     * Watch a specific title. Behavior depends on current state.
     */
    public void watch(String title) {
    state.watch(title);
    }
    /**
     * sets the current state of the TV
     */
    public void setState(State state) {
        this.state = state;
    }
    // getters for the different states
    public State getHomeState() {
        return homeState;
    }
    public State getNetflixState() {
        return netflixState;
    }
    public State getHuluState() {
        return huluState;
    }
}