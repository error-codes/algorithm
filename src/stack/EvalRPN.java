package stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/16 13:45
 * @descritpion EvalRPN
 */
public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    Integer s2 = eval.pop();
                    Integer s1 = eval.pop();
                    eval.push(s1 + s2);
                    break;
                case "-":
                    s2 = eval.pop();
                    s1 = eval.pop();
                    eval.push(s1 - s2);
                    break;
                case "*":
                    s2 = eval.pop();
                    s1 = eval.pop();
                    eval.push(s1 * s2);
                    break;
                case "/":
                    s2 = eval.pop();
                    s1 = eval.pop();
                    eval.push(s1 / s2);
                    break;
                default:
                    eval.push(Integer.valueOf(token));
            }
        }
        return eval.pop();
    }
}