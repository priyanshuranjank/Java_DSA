import java.util.Stack;

public class PushAtBottom {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    bottom(s, 5);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
    
    }
    public static void bottom(Stack<Integer> s, int n){
      if(s.isEmpty()){
      s.push(n);
      return;
      }
      int top = s.pop();
      bottom(s, n);
      s.push(top);
    }
}
