public class binomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(binomial(n, r));
    }
    public static int binomial(int n,int r){
       int p = factor(r);
       int q = factor(n);
       int s= factor(n-r);
       return (q)/(p*s);
    }
    public static int factor(int a){
        if(a<=0){return -1;}
        int temp = 1;
        for(int i=1; i<=a;i++){ temp = temp*i;}
    
    return temp;
    }
}
