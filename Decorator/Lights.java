package Decorator;

import java.util.ArrayList;

/** decoratoe adds lights to tree */

public class Lights extends TreeDecorator {

    /** tree being decored */
    @SuppressWarnings("unused")
    private Tree tree;

    /**
     * wraps a tree with lights
     * loads the light images and adds them to the tree
     * @param tree the tree to be decorated
     */
    public Lights(Tree tree) {
          // TreeDecorator extend Tree so we can use super to call the Tree constructor
          super(tree.lines);
          this.tree = tree;
    
          ArrayList<String> decor = FileReader.getLines("Decorator/lights.txt"); // load light images from file
          integrateDecor(decor); // integrate the decorations into the tree
        }
    }