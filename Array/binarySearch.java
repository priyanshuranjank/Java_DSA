public class binarySearch {
    public static void main(String[] args) {
         
        int num[] = {5, 6, 7, 8, 10, 13, 15, 16};
        int key = 15; //find index value of key
        System.out.println("index of key : " + binarySearch(num, key));
    }

    public static int binarySearch(int num[], int key) {
        int start = 0; int end = num.length -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }
}
