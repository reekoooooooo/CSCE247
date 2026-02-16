package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Singleton class that creates random outfits for a given season.
 * Loads clothing items from FileReader and stores them by ClothingPart.
 */
public class OutfitCreator {

    /** Map of clothing items grouped by clothing part (TOP, BOTTOM, WHOLE). */
    private HashMap<ClothingPart, ArrayList<ClothingItem>> clothing;

    /** Random object for picking random items. */
    private Random rand;

    /** The one and only singleton instance. */
    private static OutfitCreator outfitCreator;

    /**
     * Private constructor so nobody can do new OutfitCreator().
     * Loads clothing lists from FileReader into the HashMap.
     */
    private OutfitCreator() {
        clothing = new HashMap<>();
        rand = new Random();

        clothing.put(ClothingPart.TOP, FileReader.getTops());
        clothing.put(ClothingPart.BOTTOM, FileReader.getBottoms());
        clothing.put(ClothingPart.WHOLE, FileReader.getwholes());
    }

    /**
     * Gets the one singleton instance of OutfitCreator.
     *
     * @return singleton OutfitCreator instance
     */
    public static OutfitCreator getInstance() {
        if (outfitCreator == null) {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    /**
     * Returns a random outfit for the given season.
     * It tries WHOLE first sometimes; otherwise does TOP + BOTTOM.
     *
     * @param season the season to build an outfit for
     * @return a String describing the outfit
     */
    public String getOutfit(Season season) {
        ArrayList<ClothingItem> seasonWholes =
                filterBySeason(clothing.get(ClothingPart.WHOLE), season);

        ArrayList<ClothingItem> seasonTops =
                filterBySeason(clothing.get(ClothingPart.TOP), season);

        ArrayList<ClothingItem> seasonBottoms =
                filterBySeason(clothing.get(ClothingPart.BOTTOM), season);

        // 50/50 choose WHOLE if available
        if (!seasonWholes.isEmpty() && rand.nextBoolean()) {
            ClothingItem whole = seasonWholes.get(rand.nextInt(seasonWholes.size()));
            return "Season: " + season + "\nWHOLE: " + whole;
        }

        // Otherwise TOP + BOTTOM
        if (!seasonTops.isEmpty() && !seasonBottoms.isEmpty()) {
            ClothingItem top = seasonTops.get(rand.nextInt(seasonTops.size()));
            ClothingItem bottom = seasonBottoms.get(rand.nextInt(seasonBottoms.size()));
            return "Season: " + season + "\nTOP: " + top + "\nBOTTOM: " + bottom;
        }

        return "Sorry, I couldn't create an outfit for " + season +
                ". Not enough clothing items for that season.";
    }

    /**
     * Filters a list of items to only those wearable in the given season.
     *
     * @param items  list of clothing items
     * @param season season to filter by
     * @return filtered list
     */
    private ArrayList<ClothingItem> filterBySeason(ArrayList<ClothingItem> items, Season season) {
        ArrayList<ClothingItem> result = new ArrayList<>();
        if (items == null) return result;

        for (ClothingItem item : items) {
            if (item != null && item.hasSeason(season)) {
                result.add(item);
            }
        }
        return result;
    }
}
