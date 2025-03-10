public class palindromeString {
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));

            }
        
    public static boolean isPalindrome(String str) {
        boolean key = true;
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) !=str.charAt(n-1-i)){
                key = false;
            }
        }
        return key;
    }
}
