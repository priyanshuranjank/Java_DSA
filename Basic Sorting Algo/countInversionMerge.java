public class countInversionMerge {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        
        int ans = mergeSort(arr,0,n-1);
            System.out.println(ans);

    }
        
            public static int mergeSort(int[] arr, int l, int r) {
                int countInv = 0;
                if(l<r) {
                    int mid = (l+r)/2;

                    countInv = countInv +  mergeSort(arr, l, mid);
                    countInv = countInv + mergeSort(arr, mid+1, r);

                    countInv = countInv + merge(arr,l,mid,r);

                            }
                return countInv;
            }
                    
            public static int merge(int[] arr, int l, int mid, int r) {
                int invCount = 0;

                int n = mid-l+1;
                int m  = r-mid;
                int[] lArr = new int[n];
                int[] rArr = new int[m];
                for(int i=0;i<n;i++){
                    lArr[i] = arr[l+i];
                }
                for(int i=0;i<m;i++){
                    rArr[i] = arr[mid+1+i];
                }

                int i = 0; int j = 0; int k = l;

                while(i<n && j<m){
                    if(lArr[i]<=rArr[j]){
                        arr[k++] = lArr[i++];
                    }else{
                        arr[k++] = rArr[j++];
                        // lArr[i] > rArr[j] and i<j
                        invCount = invCount + (n - i);
                    }
                }
                 // Copy remaining elements of lArr
        while (i < n) {
            arr[k++] = lArr[i++];
        }

        
        while (j < m) {
            arr[k++] = rArr[j++];
        }

                return invCount;

            }
}
