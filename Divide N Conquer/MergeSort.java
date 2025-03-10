public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,1,2,5,4,3,7,6};

        mergeSort(arr,0, arr.length-1);
        for(int ans:arr){System.out.print(ans+" ");}
    }
    public static void mergeSort(int arr[],int si,int ei) {
        if(si>=ei){
            return ;
        }
        
        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        mergeArray(arr,si,mid,ei);

    
    }
    public static void mergeArray(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si ; int j = mid+1 ; int k = 0 ;

        while(i<= mid && j<= ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];  
            }
        }
        while(i<=mid){
                temp[k++] = arr[i++];
        }
        while(j<=ei){
                temp[k++] = arr[j++];
        }

        //copy temp to og arr
        
        i=si;
        for(k=0; k<temp.length; k++){
            arr[i++]=temp[k];
        }

    }
}