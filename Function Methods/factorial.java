public class factorial {
    public static void main(String[] args) {
        int result = factor(-10);
        System.out.println(result);
    }
    public static int factor(int a){
        if(a<=0){return -1;}
        int temp = 1;
        for(int i=1; i<=a;i++){ temp = temp*i;}
    
    return temp;
    }
}
