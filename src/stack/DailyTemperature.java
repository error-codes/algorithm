package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/16 14:31
 * @descritpion DailyTemperature
 */
public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }

        return res;
    }

}
