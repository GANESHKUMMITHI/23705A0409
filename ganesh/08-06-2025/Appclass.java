 import java.util.Scanner;
 public class Appclass{
    public static void app(String Appname,String[] catogories){
       System.out.println("Appname:"+Appname);
        Scanner scanner = new Scanner(System.in);
           System.out.println("enter a value:");
          int j= scanner.nextInt();
          if(j==0){
            System.out.println("CATOGORIES:\n");
            System.out.println("1."+catogories[0]+":98%");
            System.out.println("2."+catogories[1]+":");
            Scanner s = new Scanner(System.in);
            System.out.print("month:");
            String month=s.nextLine();
            Scanner t = new Scanner(System.in);
            System.out.print("date:");
            int date=t.nextInt();
             Scanner u = new Scanner(System.in);
            System.out.print("year:");
            int year=u.nextInt();
            Scanner v = new Scanner(System.in);
            System.out.println("festival:");
            String festival=v.nextLine();
            System.out.println(date+"-"+month+"-"+year+" is " +festival);
            System.out.println("3."+catogories[2]+":");
            Scanner w = new Scanner(System.in);
            System.out.println("dob:");
            String dob=w.nextLine();
            System.out.println("today is festival in our college");
            System.out.println("4."+catogories[3]+":");
            int fees=scanner.nextInt();
            System.out.println(fees+ " have paid");
        }
        else{
        System.out.println("___________________________________________");
        }
    }
public static void main(String[] args) {
    String Appname="CAMPEX";
    String[] catogories={"ATTENDENCE","CALENDER","PROGRAMS","FEESPAYMENT"};
     app(Appname,catogories);
}
}