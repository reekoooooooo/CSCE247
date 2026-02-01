package Decorator;

import java.util.ArrayList;

/**
 * concrete Tree that represents a star decoration
 */
public class Star extends TreeDecorator {

    /**
     * tree being decorated
     */
    @SuppressWarnings("unused")
    private Tree tree;

    /**
     * Constructor for Star
     * @param tree tree being decorated
     */
    public Star(Tree tree) {
        //TreeDecorator extends tree, so we need to call super with the lines of the decorated tree
        super(tree.lines);
       
        
        // Get the star decoration lines from file
        ArrayList<String> decor = FileReader.getLines("star.txt");
        integrateDecor(decor); // integrate the star decoration into the tree
    }
}