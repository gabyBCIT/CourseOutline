package ca.bcit.coop.hackathon;
/**
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zhangyuanyuan
 *
 */
public class Driver2 {

    /**
     * @param args
     * @throws FileNotFoundException 
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
    /*    public static void main(String[] args) {
            Date assignment = new Date(2, 21);
            ArrayList<Task> task = new ArrayList<Task>();
            Task task1 = new Task("Assignment", assignment, CourseName.COMP2526);
            task.add(task1);
            Course math = new Course("COMP", 1113, task);
            System.out.println(math.toString());
        }
     */
    
        public static void main(String[] args) throws FileNotFoundException {

            
            Task2 task1 = new Task2("Java Lab", new Date(2, 21), "COMP2526");
            Task2 task2 = new Task2("Web Assignment", new Date(3, 30), "COMP2121");
            Task2 task3 = new Task2("Math Quiz", new Date(3, 30), "COMP2510");
            
            for(Task2 thisTask : Task2.array) {
                System.out.println(thisTask);
            }

        }
    }


