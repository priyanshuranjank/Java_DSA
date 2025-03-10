public class quesThree {
    public static void main(String[] args) {
        int num = 1221;
        // int rem = num/10;
        // System.out.println(rem);
        System.out.println(num+" is a palindrome: "+palindrome(num));
       
    }
    public static boolean palindrome(int num){
        int rev =0;
        int temp = num;
        while (num != 0) {
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp == rev){
            return true;
        }else{
            return false;
        }

    }}