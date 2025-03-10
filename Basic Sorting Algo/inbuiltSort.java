import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,1,3,2};
        Arrays.sort(arr);
        //(arr, startIndex, endIndex)
        printArray(arr);
    }
    public static void printArray(int[] arr){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
