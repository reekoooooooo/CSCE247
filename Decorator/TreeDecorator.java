package Decorator;

import java.util.ArrayList;

/**
 * abstract decorator class for Tree objects
 * provides function to integrate decoration
 * into the tree
 */
public class TreeDecorator extends Tree {

    /**
     * constructs a TreeDecorator wrapping a tree
     * @param lines the lines of the tree to be decorated
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }
    /**
     * integrates the decoration into the tree
     *
     * @param decor the decoration to be integrated
     */
protected void integrateDecor(ArrayList<String> decor) { // integrate the decoration into the tree
    if (decor == null || decor.isEmpty()) {
        return; // nothing to integrate
    }

    int maxLines = Math.max(lines.size(), decor.size()); // determine the maximum number of lines between tree and decoration
    ArrayList<String> newLines = new ArrayList<>(); // new lines for the decorated tree
    
    for (int i = 0; i < maxLines; i++) { // iterate through each line
        String baseLine = (i < lines.size()) ? lines.get(i) : ""; // get the line from the tree or empty if out of bounds
        String decorLine = (i < decor.size()) ? decor.get(i) : ""; // get the line from the decoration or empty if out of bounds
        newLines.add(mergeLines(baseLine , decorLine)); // combine the tree line and decoration line
    }

    lines = newLines; // update the tree lines with the decorated lines
}

/**
 * merges two lines by overlaying non-space characters from the decoration line onto the base line
 * private helper methods are used internally by integrateDecor and are not part of the UML interface.
 */
private String mergeLines(String base, String decor) {
        int maxLength = Math.max(base.length(), decor.length());
        StringBuilder merged = new StringBuilder(maxLength);

        for (int i = 0; i < maxLength; i++) {
            char baseChar = (i < base.length()) ? base.charAt(i) : ' ';
            char decorChar = (i < decor.length()) ? decor.charAt(i) : ' ';

            // If decor has a visible character, it overwrites the base.
            merged.append(decorChar != ' ' ? decorChar : baseChar);
        }

        return merged.toString();
    }
}
