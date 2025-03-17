

public class MergeSortLL {
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(5);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(2);
        ll.print(); System.out.println();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){return head;}

        Node mid = midNode(head);
        Node leftHead = head;
        Node rightHead = mid.next;
        mid.next = null;

        Node head1 = mergeSort(leftHead); 
        Node head2 = mergeSort(rightHead);

       return  merge(head1,head2);
    }
    public static Node merge(Node head1, Node head2){

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergedLL.next;

    }
    //Mid node
    public static Node midNode(Node head){
            Node slow = head;
            Node fast = head.next; // midnode will be 1 less than actual mid node
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
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
    public static Node tail;
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        //give increment after every new node creation
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
}
