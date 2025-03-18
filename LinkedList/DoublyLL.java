public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addLast(4);
        // dll.addFirst(3);
        // dll.removeFirst();
        dll.print();
    }

    //Add last
    public void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){head=tail=newNode;}
    newNode.prev = tail;
    tail.next = newNode;
    tail = newNode;
    }
    // Add first
    public void addFirst(int data)  {
        Node newNode  = new Node(data);
        if(head==null){
            head  = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // print
    public void print(){
        if(head == null){
            System.out.println("Nothing to print"); return;
        }
        Node temp = head;

        while(temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void removeFirst(){
        if(head == null){ System.out.println("Nothing to remove");return ; }
        head = head.next;
        head.prev = null;
    }

    // Node of DLL
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head; //head - property defined as Node
    public static Node tail; 
    public static Node size;
    
}
