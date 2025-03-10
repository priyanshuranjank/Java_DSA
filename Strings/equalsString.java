public class equalsString {
    public static void main(String[] args) {
        String str = "priya";
        String str2 = new String("priya");

        if(str.equals(str2)){
            System.out.println("yes Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
