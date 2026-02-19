package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterates over an array of assignments, optionally filtering by Topic.
 */
public class AssignmentIterator implements Iterator<Assignment> {
    private Assignment[] assignments;
    private Topic topic;
    private int position;

    /**
     * Creates an iterator.
     * @param assignments array to iterate over
     * @param topic topic filter (Topic.ALL shows everything)
     */
    public AssignmentIterator(Assignment[] assignments, Topic topic) {
        this.assignments = assignments;
        this.topic = topic;
        this.position = 0;
    }

    /**
     * Moves position forward until it points at a matching assignment
     * or runs out of items.
     */
    private void moveToNextValid() {
        while (position < assignments.length
                && assignments[position] != null
                && !assignments[position].hasTopic(topic)) {
            position++;
        }
    }

    /**
     * Checks if there is another valid assignment.
     * @return true if there is one, otherwise false
     */
    @Override
    public boolean hasNext() {
        moveToNextValid();
        return position < assignments.length && assignments[position] != null;
    }

    /**
     * Returns the next valid assignment.
     * @return next Assignment
     */
    @Override
    public Assignment next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more assignments.");
        }
        return assignments[position++];
    }
}
