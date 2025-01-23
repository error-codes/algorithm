package stack;

/**
 * @author YoungCR
 * @date 2025/1/15 20:50
 * @descritpion ValidBracket
 */
public class ValidBracket {

    public boolean isValid(String s) {
        char[] sCharArray = s.toCharArray();
        int    pos        = -1;

        for (char c : sCharArray) {
            if (c == '(' || c == '[' || c == '{') {
                sCharArray[++pos] = c;
            } else {
                if (pos == -1 || !match(sCharArray[pos--], c)) {
                    return false;
                }
            }
        }
        return pos == -1;
    }

    private boolean match(char left, char right) {
        return left == '(' && right == ')' ||
                left == '[' && right == ']' ||
                 left == '{' && right == '}';
    }

}
