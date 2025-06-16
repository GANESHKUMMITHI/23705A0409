import java.util.Scanner;
public class Reverseofnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value:");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int val=n%10;
              System.out.print(val);
             n=n/10;
        }
          System.out.println();
    }
}