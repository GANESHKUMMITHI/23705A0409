import java.util.Scanner;
public class Table{
    public static void table(int k){
        for(int i=0;i<=10;i++){
            int result=k*i;
            System.out.println(k+"x"+i+"="+result);
        }
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value:");
      int k=sc.nextInt();
      table(k);
    }
}