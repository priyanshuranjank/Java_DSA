public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // to sonvert StringBuilder in String
        sb.toString();
        // toStirgn() works on object class like Integer, Character
    

        StringBuilder sb2 = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            sb2.append(ch);
        }

        System.out.println(sb2);
    }
}
