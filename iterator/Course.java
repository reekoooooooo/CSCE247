package iterator;

/**
 * Represents a course that contains assignments.
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * Creates a new Course.
     * @param name course code (ex: CSCE 247)
     * @param title course title (ex: Software Engineering)
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        this.assignments = new Assignment[4];
        this.count = 0;
    }

    /**
     * Adds an assignment to the course.
     * @param title assignment title
     * @param description assignment description
     * @param topic assignment topic
     */
    public void addAssignment(String title, String description, Topic topic) {
        if (count == assignments.length) {
            assignments = growArray(assignments); //if the array is full creatse a bigger one and copies everying into it
        }
        assignments[count++] = new Assignment(title, description, topic);
    }

    /**
     * Creates an iterator that can loop over assignments filtered by topic.
     * @param topic topic filter
     * @return AssignmentIterator
     */
    public AssignmentIterator createIterator(Topic topic) {
        return new AssignmentIterator(assignments, topic);
    }

    /**
     * Course label used in driver header.
     */
    @Override
    public String toString() {
        return name + " - " + title;
    }

    /**
     * Doubles the array size.
     * @param first original array
     * @return bigger array with same contents
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] bigger = new Assignment[first.length * 2];
        for (int i = 0; i < first.length; i++) {
            bigger[i] = first[i];
        }
        return bigger; //returns new bigger array
    }
}
