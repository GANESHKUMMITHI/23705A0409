import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value:");
        int n=sc.nextInt();
         int j=5;
         int l=2;
         int count=0;
         int count1=0;
       for(int i=0;i<=n;i++){
           if(n%i==0){
               count++;
           }
           if(count==j){
               int result=n/j;
               int val=result-1;
               int 
               for(int k=0;k<=val;k++){
                   if(val%k==0){
                       count1++;
                   }
                   if(count1=l){
                       int srg=val/l;
                       int krg=srg-1;
                       System.out.println(n+">>"+result+">>"+val+">>"+srg+">>"+krg);
                   }
               }
           }
       }
    }
}