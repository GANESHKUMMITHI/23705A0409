import java.util.Scanner;
public class Movieclass{
    public static void movie(String movie_name,int rating,String duration_time,float hitrating){
        System.out.println("movie_name:"+movie_name);
        System.out.println("rating:"+rating);
        System.out.println("duration_time:"+duration_time);
        System.out.println("hit"+hitrating);
        if(hitrating>=8.5){
            System.out.println( movie_name + "movie is hit");
            Scanner scanner = new Scanner(System.in);
           System.out.println("enter a review:\t");
          String review = scanner.nextLine();
        }
        else if(hitrating<8.5 && hitrating>5){
            System.out.println(movie_name + "movie is average");
        }
        else{
            System.out.println("movie is not good");
        }
    }
  public static void main(String[]args){
    String movie_name="BAHUBALI";
    int rating=5;
    String duration_time="3h 21m";
    float hitrating=8.5f;
    movie(movie_name,rating,duration_time,hitrating);
 }
 }