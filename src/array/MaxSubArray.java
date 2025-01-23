package array;

/**
 * @author YoungCR
 * @date 2025/1/7 20:36
 * @descritpion MaxSubArray
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            if (dp > max) {
                max = dp;
            }
        }
        return max;
    }
}
