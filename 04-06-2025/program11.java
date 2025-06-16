public class Main{
    public static int star(int n,int x){
        if(x==0){
            return n;
        }
        int val=n*star(n,x-1);
        return val;
    }
    public static void main(String[]args){
        int n=2;
         int x=5;
        System.out.println(star(n,x));
    }
}