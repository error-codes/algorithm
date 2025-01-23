package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author YoungCR
 * @date 2025/1/17 17:51
 * @descritpion DecodeString
 */
public class DecodeString {

    public String decodeString(String s) {
        Deque<Integer> number = new ArrayDeque<>();
        Deque<String>  string = new ArrayDeque<>();

        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int num = 0;
        for (char c : charArray) {
            if (c == '[') {
                number.addLast(num);
                string.addLast(stringBuilder.toString());
                num = 0;
                stringBuilder = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp    = new StringBuilder();
                int           current = number.removeLast();
                while (current-- > 0) {
                    temp.append(stringBuilder);
                }
                stringBuilder = new StringBuilder(string.removeLast() + temp);
            } else if (isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
