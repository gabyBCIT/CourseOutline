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
    private boolean complete;
    
    private Task(String name, Date date) {
        taskName = name;
        dueDate = date;
        complete = false;
    }

    /**
     * Returns the taskName for this Task.
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets taskName for this Task.
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Returns the dueDate for this Task.
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets dueDate for this Task.
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Returns the complete for this Task.
     * @return the complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets complete for this Task.
     * @param complete the complete to set
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    
}
