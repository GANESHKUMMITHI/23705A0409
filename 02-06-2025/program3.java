public class App{
    public static void main(String[]args){
        String[] nums={"ganesh","ganesh","Ganesh","pavan","mahaboob"};
        int i=0;
        for(int j=0;j<nums.length;j++){
            if (nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        for(int j=0;j<=i;j++){
            System.out.print(nums[j]+"\n ");
        }
    }
}