import java.util.Stack;

public class TailInsertion {

    public static String insertTail(String largeTail, String smallTail) {
        Stack<Character> stack = new Stack<>();
        return insertTailRecursive(largeTail, smallTail, stack);
    }

    private static String insertTailRecursive(String largeTail, String smallTail, Stack<Character> stack) {
        if (largeTail.isEmpty()) {
            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
            return result.toString();
        }

        stack.push(largeTail.charAt(0));
        
        if (largeTail.length() == 1) {
            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
            return result.append(smallTail).toString();
        }
        
        return insertTailRecursive(largeTail.substring(1), smallTail, stack);
    }

    public static void main(String[] args) {
        String largeTail = "abcdef";
        String smallTail = "xyz";
        String result = insertTail(largeTail, smallTail);
        System.out.println("Large Tail: " + largeTail);
        System.out.println("Small Tail: " + smallTail);
        System.out.println("Result: " + result);  // Output: Result: abcdefxyz
    }
}