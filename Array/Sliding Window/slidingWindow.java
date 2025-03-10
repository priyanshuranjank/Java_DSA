public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6};
        int k = 3;
        System.out.println(sliding(arr,k));
    }
    public static int sliding(int[]arr,int k){
        int totalSum = 0;
        for(int i=0;i<k;i++){
            totalSum = totalSum + arr[i];
        }
        int maxTotal = totalSum;
        for(int i=0;i<arr.length-k;i++){
            totalSum = totalSum - arr[i];
            totalSum = totalSum + arr[i+k];
            
            maxTotal = Math.max(maxTotal, totalSum);
        }
        return maxTotal;
        
    }
}
