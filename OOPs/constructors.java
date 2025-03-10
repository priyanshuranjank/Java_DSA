public class constructors {
    public static void main(String[] args) {
        student st = new student("johnny");
        System.out.println(st.name);
    }
}

class student  {
    String name;
    int rollno;

    student (String name){
        this.name = name;
    }

    // student(){
    //     System.out.println("Constructor is called.");
    // }  hint: remove "johnny" from "object" intialisation 
    
}
