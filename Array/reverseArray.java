public class reverseArray {
    public static void main(String[] args) {
         int[] num =  {9,5,1,4,6,0};
         reverse(num);
         for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
         }

    }
    public static void reverse(int[] num) {
        int first = 0; int last = num.length - 1;
        int temp = num[last];
        num[last] = num[first];
        num[first] = temp;
        first++;
        last--;
    }
}
