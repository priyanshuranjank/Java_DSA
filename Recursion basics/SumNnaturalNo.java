public class SumNnaturalNo {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(sum(n));
            }
        
        private static int sum(int n) {

            if(n==1){return 1;}
            int add = n + sum(n-1);
            return add;
            
        }


}
