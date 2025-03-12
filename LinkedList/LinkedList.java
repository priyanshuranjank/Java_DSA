public class LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.print();

        System.out.println();

        ll.add(1, 5);
        ll.print();

        
    }

    //Node 
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; //head - property defined as Node
    public static Node tail; //tail 

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){head=tail=newNode; return;}
        newNode.next = head;
        head = newNode;
    }
    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){head=tail=newNode; return;}
        tail.next = newNode;
        tail = newNode;
    }
    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    //Add in middle**
    public void add(int index, int data){
        if(index==0){ // index is 0, means updating head(1st node)
            addFirst(data);  return;
        }

        Node newNode = new Node(data); 
        Node temp = head;
        int i=0;
        while(i < index-1){
          temp = temp.next;
          i++;  
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



}
