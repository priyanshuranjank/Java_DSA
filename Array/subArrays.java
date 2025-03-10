public class subArrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        subarray(arr);

    }
    public static void subarray(int[] arr) {
        int totalSubarray = 0; //count of no. of subarray
        int highestSum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int totalSum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    totalSum = totalSum + arr[k];
                }
                System.out.print("| sum: "+totalSum);
                totalSubarray++;
                System.out.println();
                if(totalSum > highestSum){
                    highestSum = totalSum;
                }
            }
            System.out.println();

        }
        System.out.println("max sum of a subrray among all: " +highestSum);
        System.out.println("Total Subarray: "+ totalSubarray);
        

             
    }
}
