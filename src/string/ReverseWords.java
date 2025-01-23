package string;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author YoungCR
 * @date 2025/1/14 16:30
 * @descritpion ReverseWords
 */
public class ReverseWords {

    public String reverseWords(String s) {
        char[] sCharArray = s.toCharArray();
        char[] result     = new char[s.length() + 1];
        int    i          = s.length() - 1, idx = 0;
        while (i >= 0) {
            while (i >= 0 && sCharArray[i] == ' ') {
                i--;
            }
            int end = i;
            while (i >= 0 && sCharArray[i] != ' ') {
                i--;
            }
            for (int start = i + 1; start <= end; start++) {
                result[idx++] = sCharArray[start];
                if (start == end) {
                    result[idx++] = ' ';
                }
            }
        }
        return new String(result, 0, idx - 1);
    }

}
