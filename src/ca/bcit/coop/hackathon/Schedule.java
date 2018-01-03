package hack;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Schedule {
    
    

    public Schedule() {

    }

    public static void setWeeks() throws Exception {

        String[] month = {"2018-01", "2018-02", "2018-03", "2018-04"};

        int weeks = 0;

        for (int i = 0; i < month.length; i++) {

            Calendar c = Calendar.getInstance();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            Date date = format.parse(month[i]);

            c.setTime(date);

            int start = c.get(Calendar.WEEK_OF_MONTH);

            c.add(Calendar.MONTH, 1);
            c.add(Calendar.DATE, -1);

            int end = c.get(Calendar.WEEK_OF_MONTH);

            weeks += (end - start + 1);

        }

        System.out.println(weeks);

    }
    
    public static long getWeekNumber(int month, int day) {
        
        Calendar date1 = new GregorianCalendar(2018, 0, 8);
        Calendar date2 = new GregorianCalendar(2018, month - 1, day);
        System.out.println(date2.get(Calendar.DAY_OF_WEEK) - 1);
        
        Instant d1i = Instant.ofEpochMilli(date1.getTimeInMillis());
        Instant d2i = Instant.ofEpochMilli(date2.getTimeInMillis());
        
        LocalDateTime startDate = LocalDateTime.ofInstant(d1i, ZoneId.systemDefault());
        LocalDateTime endDate = LocalDateTime.ofInstant(d2i, ZoneId.systemDefault());
        
        int test = (int) ChronoUnit.WEEKS.between(startDate, endDate) + 1;

        return test;
        
    }

    public static void main(String[] args) throws Exception {

        setWeeks();
        System.out.println(getWeekNumber(1, 22));
    }

}