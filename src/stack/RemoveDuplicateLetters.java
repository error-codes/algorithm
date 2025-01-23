package stack;

/**
 * @author YoungCR
 * @date 2025/1/21 13:54
 * @descritpion RemoveDuplicateLetters
 */
public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int[]     charCount = new int[26];
        boolean[] hasChar   = new boolean[26];
        char[]    stack     = new char[26];
        int       start     = 0;

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            charCount[aChar - 'a']++;
        }

        for (char c : chars) {
            if (!hasChar[c - 'a']) {
                while (start > 0 && stack[start - 1] > c && charCount[stack[start - 1] - 'a'] > 0) {
                    hasChar[stack[--start] - 'a'] = false;
                }
                stack[start++] = c;
                hasChar[c - 'a'] = true;
            }
            charCount[c - 'a']--;
        }

        return String.valueOf(stack, 0, start);
    }
}
