public class SecondLargest {
    //second largest number from array
    public static void main(String[] args) {
        // int[] arr = {4,5,1,2,3,5};
        int[] arr = {10,10,10};
        largest(arr);
    }
    public static void largest(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
       
        int temp2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp2 && arr[i]<temp){
                temp2 = arr[i];
            }
        }
        System.out.println(temp2);
    }
}
