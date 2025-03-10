import java.util.Arrays;

public class suffixArray {

     public static void main(String[] args) {
        int[] arr = {5,4,6,2,1};
        int arr2[] = suffixSum(arr);
        for(int num : arr){
            System.out.print(num + " ");

        }
        System.out.println();

        System.out.println(Arrays.toString(arr2));


     }



     public static int[] suffixSum(int[] arr){
        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            suffix[i] = arr[i] + suffix[i+1];
        }

        return suffix;

     }
}