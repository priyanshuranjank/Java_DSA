import java.util.*;
//codeforces question not from recursion
public class smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        num(arr1,arr2, n, m);
    }

    public static void num(int[] a, int[] b,int n, int m){
        

        int i = 0; 
        int count = 0;


        for(int j = 0;j<m;j++){ 
        while(i<n && b[j]>a[i]){
            
                count++;
                    i++;
                 } 
            System.out.print(count+" ");

            }
            
        }
        
    }

