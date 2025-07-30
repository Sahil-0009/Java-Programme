import java.util.Stack;

public class push {
    public static boolean isEmpty(Stack<Integer> s) {
        return s.empty();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        if (isEmpty(s)) {
            System.out.println("The Stack is Empty.");
        } else {
            System.out.println("The Stack is not Empty");
        }
        System.out.println(s.size());
        s.push(10);

        if (isEmpty(s)) {
            System.out.println("The Stack is Empty.");
        } else {
            System.out.println("The Stack is not Empty");
        }
        System.out.println(s.size());
        // System.out.println(topElement(s));
        // s.push(20);
        // System.out.println(topElement(s));
        // s.push(30);
        // System.out.println(topElement(s));
        // while (!s.isEmpty()) {
        // System.out.print(s.peek() + " ");
        // s.pop();
        // }
    }
}
