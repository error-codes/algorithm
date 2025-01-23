package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/1/22 20:48
 * @descritpion MaxSlidingWindow
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] answer   = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        answer[0] = deque.peekFirst();

        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            answer[i - k + 1] = deque.peekFirst();
        }
        return answer;
    }

}
