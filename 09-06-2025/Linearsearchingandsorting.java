public class Linearsearchingandsorting{
    public static void main(String args[]){
        int[]arr={10,19,2,3,1,8,9};
        int index=-1;
        int target=9;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                index=i;
            }
        }
            System.out.println(index==-1?"elements not found:":"elements are at index:"+index );
    }
}