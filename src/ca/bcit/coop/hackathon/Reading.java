package ca.bcit.coop.hackathon;

/**
 * Deliverable.
 * 
 * @author Gabrielle
 * @version 2018
 */
public class Reading extends Task {
    private int pages;
    
    /**
     * Constructs a Deliverable object.
     * @param name
     * @param date
     * @param course
     * @param weight
     */
    public Reading(String name, Date date, CourseName course, int pages) {
        super(name, date, course);
        this.pages = pages;
    }

}
