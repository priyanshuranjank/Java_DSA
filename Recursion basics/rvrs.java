public class rvrs {

    public static void main(String[] args) {
        int num = 124;
        System.out.println(reverse(num));
      

    }
    private static int reverse(int num){
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        return rev;

        
    }
}
