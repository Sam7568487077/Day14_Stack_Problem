import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {


        Stack<Integer> st = new Stack();

        st.push(70);
        st.push(30);
        st.push(56);

        System.out.println("stack contains these elemenmts :" + st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st + " stack is empty");

    }
}
