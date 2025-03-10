public class largestNum {
    public static void main(String[] args) {
        int num[] = {12, 56, 99, 56, 34 };
        int LargestNum = getLargest(num);
        System.out.println("Largest value from array: " + LargestNum);
    }
    public static int getLargest(int num[]){
        int temp = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]>temp){
                temp= num[i];
            }
        }
        return temp;
    }
}
