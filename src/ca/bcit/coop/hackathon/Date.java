package ca.bcit.coop.hackathon;

/**
 * Date. 
 *
 * @author Nelson
 * @version 2018
 */
public class Date {
    private int month;
    private int day;
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
}
