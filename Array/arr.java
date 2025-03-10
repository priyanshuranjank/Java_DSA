import java.util.*;

public class arr {
    public static void main(String[] args){
       
        int num[] = new int[500];

        Scanner sc = new Scanner(System.in);
        num[0]= sc.nextInt();
        num[1]= sc.nextInt();
        num[2]= sc.nextInt();

        System.out.println("p: "+ num[0]);
        System.out.println("q: "+ num[1]);
        System.out.println("r: "+ num[2]);
        int percentage = (num[0]+num[1]+num[2])/3;
        System.out.println(percentage+"%");

    }
}
