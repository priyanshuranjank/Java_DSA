import java.util.ArrayList;

public class StackArrayList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(34);
        st.push(90);
        st.print();
        System.out.println(st.pop());
        st.print();
        // System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){ return -1; }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        public int peek(){
            if(isEmpty()){ return -1; }
            int val = list.get(list.size()-1);
            return val;
        }
        public boolean isEmpty(){
            
            return  list.size() == 0;
        }
        
        public void print(){
            for(int num: list){
                System.out.print(num+" ");
            }
            System.out.println(); //For printing each element
            // System.out.println(list); // For printing Array list
        }

    }
}