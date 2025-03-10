import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(solution(num));
    } 
    
    public static boolean solution(int[] num){ 
        int count =0;
        for(int i=0;i<num.length;i++){
            for(int j=i;i<num.length;i++){
                if(num[i]==num[j]){count++;}
            }
        }
                if(count>=2){ 
                    return true;
                }else{
                    return false;
                }
     
    // return false;
    } 
}
