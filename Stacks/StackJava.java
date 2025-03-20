import java.util.*;
public class StackJava {
    //From Java Collection Frameworks
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(8);
        st.push(2);
        st.push(6);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        
    }
}
