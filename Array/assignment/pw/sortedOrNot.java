public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(Sorted(arr));

    }
    public static boolean Sorted(int[] arr){ 

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;

    }}
