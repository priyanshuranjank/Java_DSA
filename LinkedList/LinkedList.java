
public class LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        // ll.print();

        // System.out.println();

        ll.add(1, 5);
        // ll.add(2, 6);
        // ll.add(3, 7);
        // ll.print();

        System.out.println("size: "+ll.size);

        // ll.removeFirst();
        // System.out.println("size: "+ll.size);
        // ll.print(); System.out.println();
        // ll.removeLast();
        ll.print(); System.out.println();
        // System.out.println(ll.search(5)); //return index of 5
        // System.out.println(ll.recursiveSearch(7)); //return index value of 7
        
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
    public static int size; // call it by object  ll.size;

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++; //give increment after every new node creation
        if(head==null){head=tail=newNode; return;}
        newNode.next = head;
        head = newNode;
    }
    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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
            addFirst(data);  
            return;
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
        size++;
    }

    //remove First node/element
    public void removeFirst(){
        if(size==0){
            System.out.println("Empty Linked List");
            return;
        }else if(size==1){
            head = tail = null;
            size--;
            System.out.println("null");
            return;
        }
        head = head.next;
        size--;
        
    }

    //remove last
    public void removeLast(){
        if(size==0){
            System.out.println("Empty Linked List");
            return;
        }else if(size==1){
            head = tail = null;
            size--;
            System.out.println("null");
            return;
        } 
        Node temp = head;
        int i=0;
        while(i < size-2){
          temp = temp.next;
          i++;  
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    //Iterative Search / Linear Search
    public int search(int key){
        Node temp = head; int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
   
    //Recursive Search
    public int recursiveSearch(int key){
        return helperFunc(head, key);
    }
    public int helperFunc(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helperFunc(head.next, key);
        if(index == -1){
            return -1;
        }

        return index + 1;
    }

}
