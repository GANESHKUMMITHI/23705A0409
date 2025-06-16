public class Transpose{
    public static void printarray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][]arr){
        int[][] newarr=new int[arr[0].length][arr.length];
           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                newarr[j][i]=arr[i][j];
            }
        }
        printarray(newarr);
    }
    public static void main(String[]args){
        int [][]arr={{1,2,3},{4,5,6}};
       System.out.println("print array:");
        printarray(arr);
            System.out.println("after transpose:");
            transpose(arr);
        
        
    }
}