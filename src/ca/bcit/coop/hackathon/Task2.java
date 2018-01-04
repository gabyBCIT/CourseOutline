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
public class Task2 implements Comparable<Task2> {
    /** The name of the task. */
    private String taskName;
    
    /** The date the task is due. */
    private Date dueDate;
    
    /** The name of the course for the task.*/
    private CourseName course;
    
    /** The day of the week of the assignment due date.*/
    private int dayOfWeek;
    
    /** An array list that holds all the tasks, sorted by date.*/
    public static ArrayList<Task2> array = new ArrayList<Task2>();

    /**
     * Constructs a Task object.
     * @param name
     *      The name of the task.
     * @param date
     *      The due date.
     * @param course
     *      the course the task is for.
     */
    public Task2(String name, Date date, CourseName course) {
        taskName = name;
        dueDate = date;
        this.course = course;

        array.add(this);

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
    public static ArrayList<Task2> getArray() {
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
    public CourseName getCourse() {
        return course;
    }

    /**
     * Sets course for this Task.
     * 
     * @param course
     *            the course to set
     */
    public void setCourse(CourseName course) {
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

        System.out.println(test);

        return test;

    }

    /**
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "Task: " + taskName + " Due Date: " + dueDate.toString() + " Course Name: " 
                + course;
    }

    @Override
    public int compareTo(Task2 o) {
        int result;
        if (dueDate == (o.dueDate)) {
            result = course.compareTo(o.course);
        } else {
            result = dueDate.compareTo(o.dueDate);
        }
        
        return result;
    }
}
