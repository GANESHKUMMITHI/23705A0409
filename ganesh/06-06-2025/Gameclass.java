// Using Static variables

 public class Gameclass{
     public static void pattern(String title,String jonour,int playcount,int rating){
         System.out.println("title:"+title);
         System.out.println("jonour:"+jonour);
         System.out.println("playcount:"+playcount);
         System.out.println("rating:"+rating);
         if ( jonour=="HORROR"){
             System.out.println("families are not allowed to " + jonour + " movie");
             
         }
        else{
            System.out.println("families are  allowed to this movie");
        }   
        } 
     public static void main(String args[]){
          String title="MAHA_BHARATHAM";
          String jonour="HORROR";
          int playcount=10;
          int rating=5;
         pattern(title,jonour,playcount,rating);
     }
 }