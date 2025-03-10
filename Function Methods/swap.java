public class swap {
    public static void main(String[] args) {
        int num1 = 4; int num2 = 5;
        System.out.println("a = "+num1+" b = "+num2);
        swap(num1, num2);

    }
    public static void swap(int num1 ,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a = "+num1+" b = "+num2);
    }
}
