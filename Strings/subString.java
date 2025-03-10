public class subString {
    public static void main(String[] args) {
      int startIndex = 3;
      int endIndex = 7;
      String str = "Hello World";
      System.out.println(substring0(str,startIndex,endIndex));

      //inbuilt substring function
      System.out.println(str.substring(0,5));

          }
      
    private static String substring0(String str, int si, int ei) {
            String substr = "";

            for(int i=si;i<ei;i++){
                substr = substr + str.charAt(i);
            }
            return substr;
    }
}
