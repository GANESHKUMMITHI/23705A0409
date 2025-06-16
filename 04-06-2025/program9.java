public class Main{
    public static void main(String[]args){
     printRange(1,6);
    }
    public static void printRange(int start,int End){
        if(start>End){
            return;
        }
        int val=start+1;
        printRange(val,End);
        System.out.println(start);
    }

}