public class TilingProblem {
    public static void main(String[] args) {
        
        int n = 12;

        System.out.println(answer(n));
    }
    public static int answer(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int vertical = answer(n-1);    // 1 is one of the dimension of the tile
        int horizontal = answer(n-2); // 2 ---- same 

        return vertical + horizontal;
    }
}
