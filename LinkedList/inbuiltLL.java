import java.util.LinkedList;

public class inbuiltLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(12);
        ll.add(4);
        ll.add(89);

        ll.remove(2);
        
        System.out.println(ll);
    }
}
