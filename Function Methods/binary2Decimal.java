public class binary2Decimal {
    public static void main(String[] args) {
        int num = 101;
        int num2 = 11;
    decimal(num);
    binary(num2);
    }
    public static void decimal(int num){
        int dec = 0;int pow = 0;
        while(num>0){ 
            
            int rem = num%10;
             dec = dec + rem*(int)(Math.pow(2,pow));
             pow++;
             num = num/10;
        }
        System.out.println(dec);
        
    }
    public static void binary(int num){
        int bin = 0;int pow = 0;
        while(num>0){ 
            
            int rem = num%2;
             bin = bin + rem*(int)(Math.pow(10,pow));
             pow++;
             num = num/2;
        }
        System.out.println(bin);
        
    }
}
