public class fiveQues {
public static void main(String[] args) {
    int num = 11111;
    System.out.println(sumDigit(num));
}
public static int sumDigit(int num){
    int sum = 0;
    while(num != 0){
        int lastDigit = num%10;
        sum = sum + lastDigit;
        num = num/10;
    }
    return sum;
}
}
