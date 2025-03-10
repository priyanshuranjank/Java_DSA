public class shortestPath {
      // Given an route containing 4 directions(E, W,N, S), find the shortest path to reach the destination. "WNEENESENNN"  
    public static void main(String[] args) {
         
        String str = "WNEENESENNN";
        int y = 0; int x = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='W'){
                x--;
            }else if(str.charAt(i)=='E'){
                x++;
            }  
        }
            double result = Math.sqrt(x*x + y*y);

            System.out.println((int)result);
    }
}
