public class Linearsearchingandsorting_functions{
    public static void main(String args[]){
        int[]arr={10,19,2,3,1,8,9};
        int index=-1;
        int target=9;
        linearsearch(arr,index,target);
    }
    public static void linearsearch(int[]arr,int index,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                index=i;
            }
        }
        System.out.println(index);
    }
}