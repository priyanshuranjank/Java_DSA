public class reverseArray {
    //not a proper solution
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        reverseArra(arr);

    }
    public static void reverseArra(int[] arr) {
        // code here

        int i =0;
        int j =arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }
}
}
