public class StackLinkedList {
   
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(34);
        st.push(90);
        st.print();
        System.out.println(st.isEmpty());
        
    }

static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            
            newNode.next = head;
            head = newNode;
            return;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int TopNum = head.data;
            head = head.next;
            return TopNum;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

         public static void print(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
         }
      

    }
}

