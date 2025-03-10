public class minNmax {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        minMax(arr);
    }
    
    public static void minMax (int[] arr){
        int temp1 = Integer.MIN_VALUE;
        int temp2 = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp1){
                temp1 = arr[i];
            }
            if(arr[i]<temp2){
                temp2 = arr[i];
            }
        }
        System.out.println("max: "+temp1+"\nMin: "+temp2);
    }
}
