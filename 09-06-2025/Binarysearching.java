public class Binarysearching{
    public static void main(String args[]){
        int[]num={1,2,3,8,9,10,19,20};
        int target=20;
        int index=-1;
        int left=0;
        int right=num.length-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(target>num[mid]){
            left=mid+1;
        }
        else if(target<num[mid]){
            right=mid-1;
        }
        else{
            index=mid;
            break;
        }
    }
    System.out.println(index==-1?"elements are not found:":"elements at index:"+index);
    }
}