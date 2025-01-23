package array;

import java.util.*;

/**
 * @author YoungCR
 * @date 2025/1/8 20:09
 * @descritpion ArrayIntersection
 */
public class ArrayIntersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set          = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int   index  = 0;
        for (Integer i : intersection) {
            result[index++] = i;
        }
        return result;
    }


}
