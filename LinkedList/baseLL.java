public class baseLL {

    public static void main(String[] args) {

    baseLL ll = new baseLL(); //object

    ll.head = new Node(1);
    ll.head.next = new Node(2);
    
        

        
    }

// Node class

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }

    public static Node head; //head node defined as property
    public static Node tail; //tail node
}