public class reverseWordOfString {
    public static void main(String[] args) {
        String str = "hello my name is chris";
        String result = reverseWords(str);
        System.out.println(result);

    }

    public static String reverseWords(String s) {
        // Code here
        String ans[] = s.split("\\s+");
        StringBuilder reverse = new StringBuilder();
        
        
        for(int i=ans.length-1;i>=0;i--){
          reverse.append(ans[i]).append(" ");
        }
        
        return reverse.toString().trim();
    }
}
