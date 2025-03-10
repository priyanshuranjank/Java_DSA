public class mergeSort {
    public static void main(String[] args) {
        // int arr[] = {3,5,1,4,6,2};
        int arr[] = {8,5,9,1,6,7};
        
        mergesort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
              
    public static void mergesort(int[] arr, int l, int r) {
        
        if(l<r){
            int mid = (l+r)/2; //representing index

            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);

            finalmerge(arr,l,mid,r);
            }                   
    }
    
            
        public static void finalmerge(int[] arr, int l, int mid, int r) {
                int n1 = mid-l+1;
                int n2 = r-mid;
            int lArr[] = new int[n1];
            int rArr[] = new int[n2];

              for(int i=0;i<n1;i++){
                lArr[i] = arr[l+i];
              }
              for(int i=0;i<n2;i++){
                rArr[i] = arr[mid+1+i];
              }

    //merging two arrays in sorted form
        int i = 0; int j=0; int k = l;

        while(i<n1 && j<n2){  
            if(lArr[i]<=rArr[j]){
                arr[k++] = lArr[i++];
            }else{
                arr[k++] = rArr[j++];
            }
        }
        while (i<n1) {
            arr[k++] = lArr[i++];
        }
        while (j<n2) {
            arr[k++] = rArr[j++];
        }


        }
}
