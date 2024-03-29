package ca.bcit.coop.hackathon;
/**
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author zhangyuanyuan
 *
 */
public class Driver {

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
        public static void main(String[] args) throws FileNotFoundException {
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);
            Date assignment = new Date(2, 21);
            Date assignment2 = new Date(4, 20);
            Date assignment3 = new Date(4, 20);
            new Task("Assignment", assignment, CourseName.COMP2510);
            new Task("Final Exam", assignment2, CourseName.COMP2510);
            new Task("Midterm", assignment3, CourseName.COMP2510);
            for(int i = 0; i < 104; i++) {
                for(Task temp : Task.getArray().get(i)) {
                    int currentTempIndex = Task.getArray().get(i).indexOf(temp);
                    int prevTempIndex = currentTempIndex - 1;
                    if(currentTempIndex == 0) {
                        System.out.println(temp.getDueDate().toString() + "\n");
                    }
                    if (currentTempIndex > 0) {
                        if(temp.getCourse().equals(Task.getArray().get(i).get(prevTempIndex).getCourse())) {
                            System.out.println("\t\t" + temp.getTaskName());
                        }
                    } else 
                    System.out.println(temp.toString());
                }
                
            }
            
            

        
    }
}


