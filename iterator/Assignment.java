package iterator;

/**
 * Represents a single course assignment.
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Creates a new Assignment.
     * @param title assignment title
     * @param description assignment description
     * @param topic assignment topic category
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * Checks if this assignment matches a requested topic.
     * Topic.ALL matches everything.
     * @param requestedTopic the topic we want to view
     * @return true if it matches, otherwise false
     */
    public boolean hasTopic(Topic requestedTopic) {
        return requestedTopic == Topic.ALL || this.topic == requestedTopic;
    }

    /**
     * Returns a friendly string for printing.
     */
    @Override
    public String toString() {
        return title + " (" + topic + "): " + description;
    }
}
