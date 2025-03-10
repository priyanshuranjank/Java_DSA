public class kadanesArray {
    //using kadane's algo for finding max sum of subarray
    public static void main(String[] args) {
        // int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int[] num = {1, -2, 6, -1, 3};
        int[] num = {-1, -2, -3, -4};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currentSum = currentSum + num[i];
            if(currentSum<0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum); 
        }

        if(maxSum==0){
            int temp = num[0];
            for(int i=0;i<num.length;i++){

                if(temp<num[i]){
                    temp = num[i];
                }
            }
            
            System.out.println(temp);
        }else{ 
        System.out.println(maxSum);}
    }
}
