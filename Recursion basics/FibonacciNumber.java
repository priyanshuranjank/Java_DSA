public class FibonacciNumber {
    public static void main(String[] args) {
        int num = 10;
       
       System.out.println( fibonacci(num));         
                
            }
        
private static int fibonacci(int num) {
if (num == 1){return 1;}
if(num == 0){return 0;}
    int ans = fibonacci(num - 1) + fibonacci(num - 2);

    return ans;
    
    }
            
}
