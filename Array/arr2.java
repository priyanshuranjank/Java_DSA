public class arr2 {
    public static void main(String[] args) {
        int age[] = {34,18, 29};
        newAge(age);
        for(int i = 0; i<age.length; i++){
            System.out.println("Age after 5yrs: "+age[i]);
        }
        

    }
    public static void newAge(int age[]) {
        for(int i = 0; i<age.length; i++){
            age[i] = age[i] + 5;
        }
    }
}
