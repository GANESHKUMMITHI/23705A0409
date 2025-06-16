
import java.util.Stack;
public class Stackelement{
    public static void pushBottom(Stack<Integer> s,int ele){
        if(s.isEmpty()){
            s.push(ele);
            return;
        }
        int val=s.pop();
        pushBottom(s,ele);
        s.push(val);
    }
    public static void main(String[]args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(50);
        s.push(20);
        s.push(30);
        pushBottom(s,50);
        pushBottom(s,60);
        int ele;
        System.out.println("elements in the stacks are:");
        System.out.println(s);
    }
}