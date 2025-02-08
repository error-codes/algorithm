import java.lang.reflect.Array;
import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {

    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;

        char[] chars  = s.toCharArray();
        String ans    = "";
        int    length = 0;

        for (int i = 0; i < chars.length; i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && chars[left] == chars[i]) {
                left--;
            }
            while (right < chars.length && chars[right] == chars[i]) {
                right++;
            }
            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                left--;
                right++;
            }
            if (right - left + 1 > length) {
                length = right - left + 1;
                ans = s.substring(left + 1, right);
            }
        }
        return ans;
    }
}
