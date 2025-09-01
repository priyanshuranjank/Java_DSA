import java.util.*;

public class QueueJCF {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    // Queue<Integer> q = new LinkedList<>();
//ArrayDeque can be also used to make class of Queue
    //Queue is an interface , not a class
    //we cant make object of interface
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
    //output: 1, 2, 3 - First In First out
    
  }
}
