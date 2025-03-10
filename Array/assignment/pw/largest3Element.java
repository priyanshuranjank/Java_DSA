import java.util.*;
public class largest3Element {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Arrays.sort(arr);
        
        int max1 =0;
        int max2 =0;
        int max3 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
                
            }
            
        }
        System.out.println(max1 + " " + max2 + " "+max3);
        
    }
}
