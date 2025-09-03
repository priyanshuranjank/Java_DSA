import java.util.*;

public class Queue2Stacks {
  public static void main(String[] args) {
      Queue q = new Queue();

      q.add(12);
      q.add(14);
      q.add(16);

    //  System.out.println(q.peek());  //12 - 12 was first in, so first out
     while (!q.isEmpty()) {
        System.out.println(q.remove());
     }
     
  }
  static class Queue {
     static Stack<Integer> s1 = new Stack<>();
     static Stack<Integer> s2 = new Stack<>();

     public static boolean isEmpty(){
      return s1.isEmpty();
     }

    //  TC: O(n) because 2 while loop n + n
     public static void add(int data){
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }

      s1.push(data);

      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
     }

     public static int remove(){
      if (s1.isEmpty()) {
        System.out.println("queue is empty.");
        return -1;
      }
      return s1.pop();
     }

     public static int peek(){
      if (s1.isEmpty()) {
        System.out.println("queue is empty.");
        return -1;
      }
      return s1.peek();
     }
  }

}
