import java.util.*;
public class Getdateandtime{
    public static void main(String[]args){
        int day;int month;int year;
        int hour;int minute;int seconds;
        GregorianCalendar date=new GregorianCalendar();
         day=date.get(Calendar.DAY_OF_MONTH);
         month=date.get(Calendar.MONTH);
         year=date.get(Calendar.YEAR);
         hour=date.get(Calendar.HOUR);
         minute=date.get(Calendar.MINUTE);
        seconds=date.get(Calendar.SECOND);
        System.out.println("calendar date is:"+day+"/"+month+"/"+year);
        System.out.println("calendar time is:"+hour+":"+minute+":"+seconds);
    }
}