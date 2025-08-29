import java.util.*;

public class ArrayListStack {
  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    //is stack empty ??
    public static boolean isEmpty(){
      return list.size() == 0;
    }

    //push
    public static void push(int data){
      list.add(data);
    }

    //pop
    public static int pop(){
       int num = list.get(list.size()-1);
       list.remove(list.size()-1);
       return num;
    }

    //peek
    public static int peek(){
      return list.get(list.size()-1);
    }
  }

  public static void main(String[] args){
    Stack s = new Stack(); // s a stack
    s.push(1);
    s.push(2);
    s.push(3); //Last in First out - 3, 2, 1

    //printing the elements
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
    

  }
}
