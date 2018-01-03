package ca.bcit.coop.hackathon;

/**
 * Task.
 * 
 * @author Gabrielle
 * @version 2018
 */
public class Task {
    private String taskName;
    private Date dueDate;
    
    private Task(String name, String date) {
        taskName = name;
        dueDate = Date(date);
    }
}
