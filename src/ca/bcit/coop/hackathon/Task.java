package ca.bcit.coop.hackathon;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Task.
 * 
 * @author Gabrielle
 * @version 2018
 */
public class Task implements Comparable<Task> {
    private String taskName;
    private Date dueDate;
    private String course;
    private int dayOfWeek;
    private static ArrayList<ArrayList<Task>> array = new ArrayList<ArrayList<Task>>();

    public Task(String name, Date date, String course) {
        taskName = name;
        dueDate = date;
        this.course = course;
        
        for (int i = 0; i < 113; i++) {
            ArrayList<Task> taskArray = new ArrayList<Task>();
            array.add(taskArray);
        }
        

        int dayNumber = getDaysNumber(date.getMonth(), date.getDay());
        
        for (int i = 0; i < 104; i++) {
            array.add(new ArrayList<Task>());
        }
        array.get(dayNumber - 1).add(this);

        Calendar dayName = new GregorianCalendar(2018, date.getMonth(), date.getDay());

        dayOfWeek = dayName.get(Calendar.DAY_OF_WEEK) - 1; // 0-6 sun-sat

    }

    /**
     * Returns the dayOfWeek for this Task.
     * @return the dayOfWeek
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Returns the array for this Task.
     * @return the array
     */
    public static ArrayList<ArrayList<Task>> getArray() {
        return array;
    }

    /**
     * Returns the taskName for this Task.
     * 
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets taskName for this Task.
     * 
     * @param taskName
     *            the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Returns the dueDate for this Task.
     * 
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets dueDate for this Task.
     * 
     * @param dueDate
     *            the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Returns the course for this Task.
     * 
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets course for this Task.
     * 
     * @param course
     *            the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Calculates the amount of days from start to end date.
     * 
     * @param month
     *            argument.
     * @param day
     *            argument.
     * @return as an integer.
     */
    public static int getDaysNumber(int month, int day) {

        Calendar date1 = new GregorianCalendar(2018, 0, 8);
        Calendar date2 = new GregorianCalendar(2018, month - 1, day);

        Instant d1i = Instant.ofEpochMilli(date1.getTimeInMillis());
        Instant d2i = Instant.ofEpochMilli(date2.getTimeInMillis());

        LocalDateTime startDate = LocalDateTime.ofInstant(d1i, ZoneId.systemDefault());
        LocalDateTime endDate = LocalDateTime.ofInstant(d2i, ZoneId.systemDefault());

        int test = (int) ChronoUnit.DAYS.between(startDate, endDate) + 1;

        return test;

    }
    

    /**
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "\t" + course + "\n\t\t" + taskName + "\n";
    }
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Task>> tasks = getArray();
        
        for (int i = 0; i < 10; i++) {
        
        CourseName course = CourseName.COMM2216;
        Date date = new Date(1, i + 10);
        
        Task task = new Task("task", date, "COMP1510");
        
        tasks.get(i).add(task);
                
        }
        
        
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Day " + (i + 1));
            if (!tasks.get(i).isEmpty()) {
                for (int k = 0; k < tasks.get(i).size(); k++) {
                    System.out.println(tasks.get(i).get(k).toString());
                }
            }
        }

    }

    @Override
    public int compareTo(Task o) {
        return course.compareTo(o.course);
    }
}
