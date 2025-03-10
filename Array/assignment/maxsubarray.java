public class maxsubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       System.out.println( maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){ 
                sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum +nums[k];
                }
                    if(sum>maxsum){
                        maxsum = sum;
                    }
                
            }
        }
        return maxsum;
    }
}
