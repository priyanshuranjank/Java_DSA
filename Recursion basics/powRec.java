public class powRec {
    public static void main(String[] args) {
         
        int ele = 2; int n = 3;

        System.out.println(pow(ele,n));
    }
    public static int pow(int e, int n){
        if(n==0){return 1;}

        return e * pow(e, n-1);
    }
}
