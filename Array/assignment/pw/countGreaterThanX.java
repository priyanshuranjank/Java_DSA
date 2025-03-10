public class countGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {5,6,1,4,9,2};
        int  x = 1;

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}