package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/16 15:16
 * @descritpion NextGreaterNum
 */
public class NextGreaterNum {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        Stack<Integer>        stack = new Stack<>();
        Map<Integer, Integer> map   = new HashMap<>();
        for (int i : nums2) {
            while (!stack.isEmpty() && i > stack.peek()) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
