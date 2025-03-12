public class baseLL {

    public static void main(String[] args) {

    baseLL ll = new baseLL(); //object

    ll.addFirst(2);
    ll.addFirst(1);
    
        

        
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

    //Methods 
    //Add first 
    public void addFirst(int data){
        Node newNode = new Node(data); //1. cretaed new node
        
        if(head == null){ // there is nothing then head and tail will be same
            head = tail = newNode;
        }

        newNode.next = head; // updating next of new node(first) by location value of old head

        head = newNode; // assigning new node as head, newnode is the first element now so it should be head
    }

}