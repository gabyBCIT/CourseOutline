package ca.bcit.coop.hackathon;

/**
 * Deliverable.
 * 
 * @author Gabrielle
 * @version 2018
 */
public class Deliverable extends Task {
    private int weight;
    
    /**
     * Constructs a Deliverable object.
     * @param name
     * @param date
     * @param course
     * @param weight
     */
    public Deliverable(String name, Date date, CourseName course, int weight) {
        super(name, date, course);
        this.weight = weight;
    }

}
