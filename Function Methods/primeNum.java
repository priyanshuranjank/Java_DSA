public class primeNum {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isPrime(num));
        prime(num);
    }
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(num);i++){
           if(num%i==0){ return false; }
        }
        return true;
    }
    public static void prime(int num){
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
