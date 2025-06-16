// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
public class Arraysort{
    public static void main(String[]args){
           int[] array1 = {1, 2, 3};
   int[] array2 = {4, 5, 6};
   int[] mergedArray = new int[array1.length + array2.length];

   int index = 0;
   for (int element : array1) {
       mergedArray[index++] = element;
       System.out.print( mergedArray[index-1]+" " );
   }
   for (int element : array2) {
       mergedArray[index++] = element;
       System.out.print( mergedArray[index-1]+" " );
   }
    }
}