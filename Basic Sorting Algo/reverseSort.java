import java.util.Arrays;
import java.util.Collections;

public class reverseSort {
     public static void main(String[] args) {
        Integer[] arr = {4,5,9,7,1,3,2}; //works on class Integer
        Arrays.sort(arr, Collections.reverseOrder());
        //(arr, startIndex, endIndex, Collections.reverseOrder());
        printArray(arr);
    }
    public static void printArray(Integer[] arr){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
