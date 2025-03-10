import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        
        int target = 6;
        int[] arr = {3,2,1,9,6,4};
            Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1; boolean key = false;

        while (low<=high) {
            
            int mid = (low+high)/2;

            if(arr[mid]==target){
                System.out.println("Target is available.");
                key = true;
                break;
            }else if(arr[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(!key){ 
        System.out.println("Not Available");
        }
    }
}