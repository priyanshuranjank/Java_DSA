import java.util.*;

public class hashmap{
  public static void main(String[] args) {
    
    HashMap<Integer,String> map = new HashMap<>();

    map.put(1, "Priyanshu Ranjan");
    map.put(2, "Aayush Pathak");
    map.put(3, "Abhishek Singh");

    // System.out.println(map);

    String s = map.get(3);
    System.out.println(s);

    System.out.println(map.containsKey(4));
    System.out.println(map.containsValue("Priyanshu Ranjan"));
    

  }
}