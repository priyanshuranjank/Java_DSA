import java.util.*;

public class arrayList{
    public static void main(String[] args) {
        //intialisation
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add values (value)
        list.add(10); 
        list.add(20);
        list.add(30); 
    // printing list
    System.out.println(list);

    //add value to specific index (index, value)
    list.add(1, 60);
    System.out.println(list);

    //change element of the index (index, value)
    list.set(2, 15);
    System.out.println(list);

    //delete element (index)
    list.remove(2);

    //size of ARRAYLIST
    int size = list.size();
    System.out.println(list+" --size: "+size);
    
    //we can use loop to print

    //sort
    Collections.sort(list);
    for(int i=0;i<size;i++){
        System.out.print(list.get(i)+" ");
    }
/*Collections class , Arrays class||| needs to study */
    }
}