import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        //Adding elements to the collections
        v.add(100);
        v.add(21);
        v.add(90);
        v.add(80);
        v.add(100);
        v.add(8);
        v.add(9);
        System.out.println("The elements present in vector Collection Class are:");
        for(int i : v)
            System.out.print( i +"\n");
       //using a user-defined comparator to sort Collection in reverse order
        Collections.sort(v,Collections.reverseOrder());
        System.out.println("The elements present in vector Collection Class after using collection reverseOrder() are:");
        for(int i : v)
            System.out.println(i);
    }
}