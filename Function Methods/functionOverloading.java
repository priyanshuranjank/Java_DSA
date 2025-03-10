public class functionOverloading {
    public static void main(String[] args) {
        int a = 3; int b = 4; int c = 2;
        System.out.println(sum(a, b));
        System.out.println(sum(3.2f, 4.1f));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
