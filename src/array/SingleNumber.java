package array;

import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/1/8 19:54
 * @descritpion SingleNumber
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
