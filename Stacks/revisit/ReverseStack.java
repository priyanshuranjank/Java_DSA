import java.util.Stack;

public class ReverseStack {
  public static void main(String[] args) {
    
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    // while (!s.isEmpty()) {
    //   System.out.println(s.peek());
    //   s.pop();
    // }
    System.out.println("Original: "+s);
    Reverse(s);
    System.out.println("Reversed: " +s);
  }
  
  public static void Reverse(Stack<Integer> s){

    if(s.isEmpty()){
      return;
    }

    int top = s.pop();
    Reverse(s);
    bottom(s, top);
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
