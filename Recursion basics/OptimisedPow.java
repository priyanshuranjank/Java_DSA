public class OptimisedPow {
    public static void main(String[] args) {
        double x = 2;
        long n = -4;

        if(n<0){
            n = -n;
            x = 1/x;
        }
        System.out.println(pow(x,n));;
    }
    public static double pow(double x, long n){
        if (n==0) { return 1; }

        double ans = pow(x, n/2);
        if(n%2 != 0){
            return x * ans*ans;
        }else{
            return ans*ans;
        }
    }
}
