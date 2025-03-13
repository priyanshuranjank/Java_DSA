
public class iterateSearch {
    public static void main(String[] args) {
        LinkedList xl = new LinkedList();
//Here i have created xl object from my own LinkedList,java file
// I can use all properties of LinkedList class from the file
        xl.addFirst(56);
        xl.addLast(60);
        
        xl.add(1, 59);
        int key = 56;

        xl.print(); System.out.println();
        System.out.println(xl.size);
        System.out.println(xl.recursiveSearch(60));
        // System.out.println();
        
    }

    public int recursiveSearch(int key){
        return helperFunc(LinkedList.head, key);
    }

    public int helperFunc(LinkedList.Node head, int key){
        if(head==null){return -1;}
        if(head.data == key){
            return 0;
        }
        int index = helperFunc(head.next, key);

        if(index==-1){return -1;}
     
            return index + 1;
    }
}
