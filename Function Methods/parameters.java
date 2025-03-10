public class parameters {
    public static void main(String[] args) {
        int num1 = 2; int num2 = 4;
        sumNum(num1, num2); // jo hmne value di hai = arguments
        System.out.println(sumNum2(num1, num2)); // by return int datatype
    }
    public static void sumNum(int num1, int num2){ // jo yha value di hai = parameters
        System.out.println(num1+num2);
    }
    public static int sumNum2(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
