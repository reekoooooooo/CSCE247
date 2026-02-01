package Decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {

    /** tree being decorated */
    @SuppressWarnings("unused")
    private Tree tree;

    /** Creates a new ornaments decorator araound a existing tree
     * loads the ornament images and adds them to the tree
     * @param tree the tree to be decorated
     */
   public Ornaments (Tree tree) {
        // TreeDecorator extend Tree so we can use super to call the Tree constructor
        super(tree.lines);

        ArrayList<String> decor = FileReader.getLines("ornaments.txt"); // load ornament images from file
        integrateDecor(decor); // integrate the decorations into the tree 
    }
}