package singleton;

import java.util.ArrayList;

public class ClothingItem {
    //name clothing item 
    private String name;
    // color of clothing item
    private String color;
    // List of seasons the clothing item is suitable for
    private ArrayList<Season> seasons;

    /**
     * Create a new ClothingItem with the specified name, color, and seasons.
     * @param name the name of the clothing item
     * @param color the color of the clothing item
     * @param seasons the seasons the clothing item is suitable for
     */
    public ClothingItem(String name, String color) {
        this.name = name;
        this.color = color;
        this.seasons = new ArrayList<>();
    }

    /**
     * Add a season to the list of seasons the clothing item is suitable for.
     * @param season the season to add
     */
    public void addSeason(Season season) {
        seasons.add(season);    
    }
    public boolean hasSeason(Season season) {
        return seasons.contains(season);
    }

    @Override
    public String toString() {
         return name + " (" + color + ")";
    }
}




