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
    
    
    public Task(String name, Date date) {
        taskName = name;
        dueDate = date;
        
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
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return " Task: " + taskName + " Due Date: " + dueDate.toString()
            + " Week: " + Schedule.getWeekNumber(dueDate.month, dueDate.day);
    }
    

    
    
}
