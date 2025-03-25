import java.util.Stack;

public class DeleteMiddleElement {
    // Function to delete the middle element
    public static void deleteMiddle(Stack<Integer> s, int current, int middle) {
        // Base case: If current equals middle, remove the element
        if (current == middle) {
            s.pop();
            return;
        }

        // Store the top element and remove it
        int top = s.pop();

        // Recursive call
        deleteMiddle(s, current + 1, middle);

        // Push the element back after the middle is removed
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        int size = s.size();
        int middle = (size / 2) + 1;  // middle position (1-based indexing)

        deleteMiddle(s, 1, middle);

        // Print the stack from top to bottom
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
