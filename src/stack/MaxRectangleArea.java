package stack;

import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/21 16:19
 * @descritpion MaxRectangleArea
 */
public class MaxRectangleArea {

    public int maximalRectangle(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int   maxArea      = 0;
        int[] curRowHeight = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                curRowHeight[j] = matrix[i][j] == '1' ? curRowHeight[j] + 1 : 0;
            }

            maxArea = Math.max(maxArea, getMaxArea(curRowHeight));
        }
        return maxArea;
    }

    private int getMaxArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        int i = 0, maxArea = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
        }

        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }

        return maxArea;
    }

}
