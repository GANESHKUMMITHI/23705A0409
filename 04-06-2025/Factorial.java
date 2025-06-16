import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value:\t");
        int n=scanner.nextInt();
     System.out.println(fact(n)); 
    }
        public static int fact(int n){
            if(n==1){
                return 1;
            }
            int val=n*fact(n-1);
            return val;
        }
    }