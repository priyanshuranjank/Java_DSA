public class linearSearch {
    public static void main(String[] args) {
        int num[] = {89,45,89,90,23,45,68,48,20};
        int key = 69;
        int index = findKey(num, key);
        if(index == -1){
            System.out.println("N\\A");
        }else{
            System.out.println("index value of key: "+ index);
        }
    }
    public static int findKey(int num[], int key) {
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
}
