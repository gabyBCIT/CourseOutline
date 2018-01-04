package ca.bcit.coop.hackathon;


/**
 * Date. 
 *
 * @author Nelson
 * @version 2018
 */
public class Date {
    public int month;
    public int day;
    
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }
    
    /**
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Returns the day of the month of this date.
     *
     * @returns the day of month
     */
    public int getDay() {
        return day;
    }

    /**
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "Month " + month + " Day " + day;
    }
    
    
    public int compareTo(Date o) {
        if (this.month == o.month) {
            return this.day - o.day;
        }
        if (this.month > o.month) {
            return this.month - o.month;
        } else {
            return o.month - this.month;
        }
        
    }
}
