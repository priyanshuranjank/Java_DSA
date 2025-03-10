public class duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        containsDuplicate(nums);
    }
    public static void containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    
                    count++; 
                    break; 
                }
            }
        }
       System.out.println(count);
    }
}
