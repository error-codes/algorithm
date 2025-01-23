package stack;

import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/21 13:56
 * @descritpion CatchRainWater
 */
public class CatchRainWater {

    public int trap(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int            count = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int curWidth = i - stack.peek() - 1;
                int curHeight = Math.min(height[left], height[i]) - height[top];
                count += curHeight * curWidth;
            }
            stack.push(i);
        }
        return count;
    }
}
