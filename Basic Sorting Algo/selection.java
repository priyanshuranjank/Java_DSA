public class selection {
    /*
     Pick the smallest (from unsorted), put it at the beginning
     */
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
    public static void selectionSort(int[]arr){

        int min; int n = arr.length;
            for(int i=0;i<n-1;i++){
               min=i;
               for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
               }
               int temp = arr[i];
               arr[i]=arr[min];
               arr[min] = temp;
            }

            
    }
    public static void printArray(int[] arr){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
