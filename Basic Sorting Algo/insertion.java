public class insertion {
    //pick an element(from unsorted part) & place in the right position in sorted part like cards
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,1,3,2};
        selectionSort(arr);
        printArray(arr);

    }
    public static void selectionSort(int[]arr){




        int n = arr.length;
        int temp, j;
        for(int i=1;i<n;i++){
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }



        
    }
    public static void printArray(int[] arr){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
