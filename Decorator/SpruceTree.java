package Decorator;

/**
 * concrete Tree that represents a undecorated spruce tree
 */

public class SpruceTree extends Tree {

    /**
     * Constructor for SpruceTree
     */
    public SpruceTree() {
        super(FileReader.getLines("spruce-tree.txt"));
    }
}