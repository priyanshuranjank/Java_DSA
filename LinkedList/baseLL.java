public class baseLL {

    public static void main(String[] args) {

    baseLL ll = new baseLL(); //object

    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(30);
    ll.addLast(40);
    
    ll.print();
        
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
            return;
        }

        newNode.next = head; // updating next of new node(first) by location value of old head

        head = newNode; // assigning new node as head, newnode is the first element now so it should be head
    }

    //Add last
    public void addLast(int data){
        Node tailNewNode = new Node(data); // created new node to add in last

        if(head==null){  // tail==null can also be written
            head = tail = tailNewNode;
            return;
        }

        tail.next = tailNewNode; // upating next of previous tail to new tail node

        tail = tailNewNode; // updating tail to newTailNode
    }

    //Print LL
    public void print(){
        if(head==null){System.out.println("-1");}

        Node temp = head; //saving head node in a temp node
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next; // going to 2nd coming node by address with next
        }
    }
}