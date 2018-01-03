package ca.bcit.coop.hackathon;
/**
 * 
 */

/**
 * @author zhangyuanyuan
 *
 */
public class Driver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Task t1 = new Task("Lab1", "Jan 08, 2017");
        Task t2 = new Task("Lab2", "Jan 16, 2017");
        
        Course c = new Course("Math", "COMP1113");
        c.addTask(t1);
        c.addTask(t2);
        
        System.out.println(c.toString());
        
    }

}
