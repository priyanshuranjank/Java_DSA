public class SplitSpelling {
  public static void main(String[] args) {
    String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    spelling(100,arr);

  }
  public static void spelling(int num,String[] arr){
      if(num==0){
        return;
      }
      int rem = num%10;
      spelling(num/10,arr);
      System.out.print(arr[rem]+" ");
    
  }
}