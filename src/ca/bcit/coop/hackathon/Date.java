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
<<<<<<< HEAD
        String monthString = "";
        switch(month) {
        case 1:  monthString = "January ";
                break;
        case 2:  monthString = "February ";
                break;
        case 3:  monthString = "March ";
                break;
        case 4:  monthString = "April ";
                break;
        case 5:  monthString = "May ";
                break;
        case 6:  monthString = "June ";
                break;
        case 7:  monthString = "July ";
                break;
        case 8:  monthString = "August ";
                break;
        case 9:  monthString = "September ";
                break;
        case 10: monthString = "October ";
                break;
        case 11: monthString = "November ";
                break;
        case 12: monthString = "December ";
                break;
        }
        return monthString + day;
=======
        String monthName = "null";
        
        switch(month) {
        case 1:
            monthName = "January";
            break;
        case 2:
            monthName = "February";
            break;
        case 3:
            monthName = "March";
            break;
        case 4:
            monthName = "April";
            break;
        case 5:
            monthName = "May";
            break;
        case 6:
            monthName = "June";
            break;
        case 7:
            monthName = "July";
            break;
        case 8:
            monthName = "August";
            break;
        case 9:
            monthName = "September";
            break;
        case 10:
            monthName = "October";
            break;
        case 11:
            monthName = "November";
            break;
        case 12:
            monthName = "December";
            break;
        }
        return monthName + " " + day;
>>>>>>> f0f2644c2f348a808c4a0141adbe29f334b58d98
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
    
    public boolean equals(Date o) {
        return (month == o.month && day == o.day);
        
    }
}
