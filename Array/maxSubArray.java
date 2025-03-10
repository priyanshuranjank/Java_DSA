public class maxSubArray {
    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};
        maxSub(num);
    }
    public static void maxSub(int[] num) {
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                   sum = sum + num[k];
                   System.out.println("sum of this subarray: "+sum);
                } 
                   if(maxSum < sum){
                    maxSum = sum;
                   }
                System.out.println();
            }
            System.out.println();
        }
     
        System.out.println("max sum of a Subarray: "+maxSum);

    }
}
