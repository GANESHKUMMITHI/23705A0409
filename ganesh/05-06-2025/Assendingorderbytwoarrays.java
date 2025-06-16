//java program to arrange in asssending order by giving two arrays
public class Assendingorderbytwoarrays{
    public static void main(String[]args){
        int[]arr1={2,9,18,21,22};
        int[]arr2={1,3,6,27,30};
        int i=0,j=0,k=0;
        int[]c=new int[arr1.length+arr2.length];
        while(arr1.length>i&&j<arr2.length){
            if(arr1[i]<arr2[j]){
            c[k]=arr1[i];
            k++;
            i++;
        }else{
            c[k]=arr2[j];
            k++;
            j++;
        }
        }
        while(i<arr1.length){
            c[k]=arr1[i];
            k++;
            i++;
        }
        while(j>arr2.length){
            c[k]=arr2[j];
            k++;
            j++;
        }
        System.out.println("elements:");
        for(k=0;k<=c.length;k++){
            System.out.println(c[k]+" ");
        }
    }

    }