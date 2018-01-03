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
public class Task {
    private String taskName;
    private Date dueDate;
    private CourseName course;
    private int dayOfWeek;
    private static ArrayList<ArrayList<Task>> array = new ArrayList<ArrayList<Task>>();

    public Task(String name, Date date, CourseName course) {
        taskName = name;
        dueDate = date;
        this.course = course;

        int dayNumber = getDaysNumber(date.getMonth(), date.getDay());

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
        return " Task: " + taskName + " Due Date: " + dueDate.toString() + "Course Name: " + course;
    }

}
