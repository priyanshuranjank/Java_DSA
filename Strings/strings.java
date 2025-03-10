import java.util.*;

public class strings {
    public static void main(String[] args) {
    //    char arr[] = {'a','b','c','v'}; //string in char
    //    String str = "Priyanshu"; //intialisation
    //    String str2 = new String("Ranjan"); //intialisation

    //    System.out.println(str +" "+str2+" "); //printing

    //    for(char b : arr){ //char printing
    //     System.out.print(b);
    //    }
    //    System.out.println();

       //Strings are immutable
       //String input
    //    Scanner sc = new Scanner(System.in); 
    //    sc.next() it takes only a word 
    //    String name = sc.nextLine();
    //    System.out.println(name);


    // length of a string 
    // System.out.println(str.length());

    //concatenation
    String first = "Priyanshu";
    String last = "Ranjan";
    String fullName = first + " " + last;
    System.out.println(fullName);
    //print a character
    System.out.println(fullName.charAt(2));
    
    for(int i=0;i<fullName.length();i++){
        System.out.print(fullName.charAt(i)+" ");
    }
    
}
}