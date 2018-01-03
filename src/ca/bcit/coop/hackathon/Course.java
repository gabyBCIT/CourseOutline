package ca.bcit.coop.hackathon;

import java.util.ArrayList;

/**
 * Course. 
 *
 * @author Nelson
 * @version 2018
 */
public class Course {
    private String name;
    private int courseNumber;
    private ArrayList<Task> taskList;
    
    public Course(String name, int courseNumber, ArrayList<Task> taskList) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.taskList = taskList;
    }
    /**
     * Returns the name for this Course.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the courseNumber for this Course.
     * @return courseNumber
     */
    public int getCourseNumber() {
        return courseNumber;
    }

    /**
     * Returns the taskList for this Course.
     * @return taskList
     */
    public ArrayList<Task> getTaskList() {
        return taskList;
    }
    
    public void addTask(Task newTask) {
        taskList.add(newTask);
    }
    /**
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        String output = "Course: " + name + courseNumber;
        for (Task temp : taskList) {
            output += temp.toString();
        }
        return output;
    }
    
    public static void main(String[] args) {
        Date assignment = new Date(2, 21);
        ArrayList<Task> task = new ArrayList<Task>();
        Task task1 = new Task("Assignment", assignment);
        task.add(task1);
        Course math = new Course("COMP", 1113, task);
        System.out.println(math.toString());
    }
    
   
  
}
