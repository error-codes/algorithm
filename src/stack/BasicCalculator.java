package stack;

import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/16 16:14
 * @descritpion BasicCalculator
 */
public class BasicCalculator {

    public int calculate(String s) {
        char[] charArray = s.toCharArray();

        return helper(charArray, 0);
    }

    private int helper(char[] charArray, int start) {
        Stack<Integer> stack = new Stack<>();
        int            num   = 0;
        char           sign  = '+';

        for (int i = start; i < charArray.length; i++) {
            char c = charArray[i];

            if ('(' == c) {
                num = helper(charArray, ++i);
                i++;
            }

            if (isDigit(c)) {
                num = 10 * num + (c - '0');
            }

            if ((!isDigit(c) && c != ' ') || i == charArray.length - 1) {
                int pre;
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        pre = stack.pop();
                        stack.push(pre * num);
                        break;
                    case '/':
                        pre = stack.pop();
                        stack.push(pre / num);
                        break;
                }
                sign = c;
                num = 0;
            }

            if (')' == c) {
                break;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
