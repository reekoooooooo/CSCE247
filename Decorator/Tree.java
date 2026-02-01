package Decorator;


import java.util.ArrayList;

/**
 * Base class representing a tree
 * holds the lines that make up the tree's visual representation
 * and handles coloring of the tree
 */

public class Tree {

    // color codes in ANSI
    protected final String RESET = "\u001B[0m";
    protected final String GREEN = "\u001B[32m";
    protected final String WHITE = "\u001B[37m";
    protected final String YELLOW = "\u001B[33m";
    protected final String RED = "\u001B[31m";
    protected final String BROWN = "\\033[1;33m";

    protected ArrayList<String> lines;

    /**
     * Constructor for Tree
     * @param lines lines that make up the tree's visual representation
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Method to get the lines of the tree
     * @return lines of the tree
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (String line : lines) {
            output.append(colorize(line)).append("\n");
        }

        output.append(RESET); // reset color at the end
        return output.toString();
    }
    /**
     * Method to colorize the tree lines
     * @param line line to be colorized
     * @return colorized line
     */
    private String colorize(String line) {
        if (line == null) return "";

                if (line.contains("Y")) {
            return YELLOW + line + RESET;   // star
        } else if (line.contains("R") || line.contains("(")) {
            return RED + line + RESET;      // ornaments
        } else if (line.contains("W") || line.contains("*")) {
            return WHITE + line + RESET;    // lights
        } else if (line.contains("B") || line.contains("|")) {
            return BROWN + line + RESET;    // trunk
        } else {
            return GREEN + line + RESET;    // branches
        }
    }
}