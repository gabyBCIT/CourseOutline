package ca.bcit.coop.hackathon;
/**
 * 
 */

import java.util.ArrayList;

/**
 * @author zhangyuanyuan
 *
 */
public class Driver {

    /**
     * @param args
     */
    //public static void main(String[] args) {
//        Task t1 = new Task("Lab1", "Jan 08, 2017");
//        Task t2 = new Task("Lab2", "Jan 16, 2017");
//        
//        Course c = new Course("Math", "COMP1113");
//        c.addTask(t1);
//        c.addTask(t2);
//        
//        System.out.println(c.toString());
        public static void main(String[] args) {
            Date assignment = new Date(2, 21);
            ArrayList<Task> task = new ArrayList<Task>();
            Task task1 = new Task("Assignment", assignment);
            task.add(task1);
            Course math = new Course("COMP", 1113, task);
            System.out.println(math.toString());
        }
        
    }


