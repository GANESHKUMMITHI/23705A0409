
import java.util.Scanner;
public class Largestnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
        }
        else if(b>c){
            if(b>a){
                System.out.println("b is largest");
            }
        }
        else{
            System.out.println("c is large");
        }
    }
}