public class Selectinsorting{
    public static void main(String[]args){
        int[]nums={19,21,3,8,9,10,12};
        for(int i=0;i<nums.length;i++){
            int midIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[midIndex]>nums[j]){
                    midIndex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[midIndex];
            nums[midIndex]=temp;
        }
        for(int val:nums)
        System.out.println(val+" ");
    }
}