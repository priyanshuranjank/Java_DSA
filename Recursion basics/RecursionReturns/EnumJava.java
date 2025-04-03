import java.util.*;

public class EnumJava {
  public static void main(String[] args) {
  
  // Scanner input = new Scanner(System.in);
  // int score = input.nextInt();
  int score = 89;
    Result[] r = Result.values();

    if (score >=  100) {
       System.out.println(r[2]);
   }else if (score >= 31) {
      System.out.println(r[0]);
   }else if (score <= 30) {
    System.out.println(r[1]);
   }
System.out.println();
  Result res = Result.Pending;
  System.out.println(res);
  System.out.println(res.ordinal()); // iindex value
System.out.println();
  //loop to print
  for(Result rr: r){
    System.out.println(rr);
  }

  }
}

enum Result{
  Passed, Failed, Distinction, Pending, Reappear, Waiting
}

//An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week. 

//You should use enum types any time you need to represent a fixed set of constants