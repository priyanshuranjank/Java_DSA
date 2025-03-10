import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str = "earth";
        String str2 = "heart";

        str =  str.toLowerCase();
        str2 = str2.toLowerCase();

        

        if(str.length() == str2.length()){
            //String into character Array
            char[] strCharArray = str.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            
            //sorting character Array
            Arrays.sort(strCharArray); Arrays.sort(str2CharArray);
            
            if(Arrays.equals(strCharArray,str2CharArray)){ //function
                System.out.println("True Anagrams");
            }else{
                System.out.println("False Anagrams");
            }
        }else{
            System.out.println("False Anagrams");
        }

    }
}
