import java.util.Scanner;
public class Swap{
    public static void table(int k,int l){
     System.out.println("before swapping:" +k+" "+l) ;
       int temp=k;
      k=l;
      l=temp;
      System.out.println("after swapping:" +k+" "+l) ;
     
    }        
    
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value:");
      int k=sc.nextInt();
      int l=sc.nextInt();
      table(k,l);
    }
}