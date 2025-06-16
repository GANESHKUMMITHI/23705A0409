public class Main4{
    public static void main(String args[]){
        int k=10;
        starangle(k);
    }
    public static void starangle(int k){
        for(int i=0;i<k;i++){
            for(int j=i;j<k;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}