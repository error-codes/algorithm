package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/1/8 15:51
 * @descritpion SearchRotateSortedArray
 */
public class SearchRotateSortedArray {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[end] >= target && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
