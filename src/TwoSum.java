import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,6,45,23,6,1,0,0,0,2,6,8,2,100,100};
        int target = 200;        

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int res = nums[i] + nums[j];

                if(i != j && res == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
