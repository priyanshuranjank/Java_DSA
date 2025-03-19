public class StackArray{ 
    public static void main(String[] args) {
     Stack st = new Stack();
//Fixed size Array
     st.push(45);
     st.push(56);
     st.push(23);
    //  st.push(98);
    //  st.pop();
    //  st.push(34);
     st.print();
     System.out.println("Top element: " + st.peek());
    // System.out.println(st.pop());
    // System.out.println();
    // st.print();
    System.out.println("Size is: " + st.size());
    System.out.println(st.isEmpty());
     
    }

static class Stack{ 
    public static int stack[] = new int[3];
    public static int top = 0;

    public void push(int data){
        if(top == stack.length){
            System.out.println("Stack is Full.");
            return;
        }
            stack[top] = data;
            top++;
        }
    public void print(){
            for(int num : stack){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    
    public int pop(){
        if(top<1){
            return -1;
        }
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek(){
        if(top<1){
            return -1;
        }
       int data = stack[top-1];
       return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){

        return top<=0;
    }
}
}
