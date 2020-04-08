package Array;

public class sameFirstLastData {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length >= 1){
            if(nums[0] == nums[nums.length - 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,1};
        sameFirstLastData check = new sameFirstLastData();
        boolean result = check.sameFirstLast(nums);
        System.out.println(result);
    }
}
