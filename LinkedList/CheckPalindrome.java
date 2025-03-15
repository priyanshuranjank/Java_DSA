// import LinkedList.Node;

public class CheckPalindrome {
    public static void main(String[] args) {
        
        LinkedList ml = new LinkedList();

        ml.addFirst(5);
        ml.addLast(5);
        ml.add(1, 6);
        // ml.add(2, 23);
        ml.print();
        System.out.print(ml.panlindrome());

    }
       
}
