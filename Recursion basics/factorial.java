public class factorial {
    public static void main(String[] args) {
        
        int num = 5;
        System.out.println(factorial(num));
            }
        
private static int factorial(int num) {
    if(num==0){ return 1;}
        // int value 
       int value =  factorial(num-1);
       num = num * value;

       return num;
}
    
}
