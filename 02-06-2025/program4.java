//array to linkedlist
import.java.util.Arrays;
import.java.util.Linkedlists;
public class{
    public static Node Arrtolist(int[] nums){
        Linkedlist list=new Linkedlist();
        for(int i=0;i<nums.length;i++){
            list.insertEnd(nums[i]);
        }
        return list.getHead();
    }
}