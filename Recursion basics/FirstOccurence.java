public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,6,8,7,5}  ;
        int target = 8;
        System.out.println(occurence(arr, target, 0));
        System.out.println(Lastoccurence(arr, target, arr.length-1));
    }
    public static int occurence(int arr[],int tar,int i){

        if(arr[i]==tar){return i;}
        if(i==arr.length-1){return -1;}
        return occurence(arr, tar, i+1);
    }
    public static int Lastoccurence(int arr[],int tar,int i){
        if(i==0){return -1;}
        if(arr[i]==tar){return i;}
        return Lastoccurence(arr, tar, i-1);

        }

}
