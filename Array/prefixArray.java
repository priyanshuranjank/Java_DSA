public class prefixArray {
    //using prefix for finding max sum of subarray
    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};
        int[] prefix = new int[num.length];
            prefix[0] = num[0];
        for(int i=1; i<num.length; i++){
                prefix[i]= prefix[i-1] + num[i];
        }
        
        //prefix[end] - prefix[start-1]
        // to find sum of subarray in between 2 index 
        // if zero is the start use if condition and only prefix[end]
        int maxSum = 0, curSum = 0;
        for(int i=0;i<num.length;i++){
            for(int j=i; j<num.length; j++){


                
            if (i==0){
                curSum=prefix[j];
            }else{
                curSum=prefix[j]-prefix[i-1];
            }

            if(maxSum<curSum) {
                maxSum = curSum;
            }

            }
        }

        System.out.println(maxSum);
    }
}
