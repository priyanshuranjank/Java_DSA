import java.util.Stack;

public class ReverseStringStack {
  public static void main(String[] args) {
    String str = "priyanshu";

   System.out.println(ReverseString(str));

  }
    public static String ReverseString(String str){
      Stack<Character> s = new Stack<>();
      int index = 0;
      while (index < str.length()) {
        s.push(str.charAt(index));
        index++;
      }

      StringBuilder newStr = new StringBuilder();

      while (!s.isEmpty()) {
        char ch = s.pop();
        newStr.append(ch);
      }
      return newStr.toString();
    }
}
