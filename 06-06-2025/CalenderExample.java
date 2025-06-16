import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        GregorianCalendar date=new GregorianCalendar();
        int day = date.get(GregorianCalendar.DAY_OF_MONTH);
        int month = date.get(GregorianCalendar.MONTH) ; 
        int year = date.get(GregorianCalendar.YEAR);
        int hour = date.get(GregorianCalendar.HOUR_OF_DAY); 
        int minute = date.get(GregorianCalendar.MINUTE);
        int second = date.get(GregorianCalendar.SECOND);

        System.out.println(day + "/" + month + "/" + year);
        System.out.println(hour + ":" + minute + ":" + second);
    }
}