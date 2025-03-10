public class pairing {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(friendsPairing(num));
    }
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
}
