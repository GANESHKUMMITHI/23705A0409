import java.util.Scanner;
public class Substring{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter string:");
        String str=s.nextLine();
        int l=str.length();
        for(int i=0;i<l;i++){
            for(int j=1;j<=l-i;j++){
             String res=str.substring(i,i+j);
             System.out.println(res);
            }
        }
    }
}