public class Boublesorting{
    public static void main(String[]args){
        int[]nums={19,21,3,8,9,10,12};
        for(int j=0;j<nums.length-1;j++){
          for(int i=0;i<nums.length-j-1;i++){
               if(nums[i]>nums[i+1]){
                 int temp=nums[i];
                 nums[i]=nums[i+1];
                 nums[i+1]=temp;
                }
            }
         boolean isSwapped=true;
            if(!isSwapped)break;
        }    
        for(int val:nums){
            System.out.print(val+" ");
    }
}
}