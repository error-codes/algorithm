package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/1/7 14:54
 * @descritpion TwoNumSum
 */
public class TwoNumSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
