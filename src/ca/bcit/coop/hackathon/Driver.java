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
            Date assignment2 = new Date(4, 20);
            Task task1 = new Task("Assignment", assignment, CourseName.COMM2216);
            Task task2 = new Task("Final Exam", assignment2, CourseName.COMM2216);
            for(int i = 0; i < 104; i++) {
                for(Task temp : Task.getArray().get(i)) {
                    System.out.println(temp.toString());
                }
                
            }
        }
        
    }


