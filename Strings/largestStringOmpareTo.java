public class largestStringOmpareTo {
    public static void main(String[] args) {
      String fruits[] = {"app","man","banana"};
      // str.compareTo(str2)
      // if 0 - Strings are equal
      // if -ve value then str < str2 if +Ve then str > str2
      String largest = fruits[0];
      for(int i=0;i<fruits.length;i++){
        if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
      }
      System.out.println(largest);
      // compare like dictionary arrangement
    }
}
