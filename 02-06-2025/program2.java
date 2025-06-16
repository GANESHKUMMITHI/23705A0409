//star stright trianlge using pattern
import java.util.Scanner;
public class Main{
public static void sangle(int k){
for(int i=0;i<k;i++){
for(int j=0;j<i;j++){
System.out.print(" * ");
}
System.out.println();
}
}
public static void main(String[]args){
int k=10;
sangle(k);
}
}