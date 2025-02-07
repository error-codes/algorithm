import java.lang.reflect.Array;
import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }

        int           longest = 1;

        char[] chars = s.toCharArray();
        StringBuilder sb      = new StringBuilder(String.valueOf(chars[0]));

        for (int i = 0; i < s.length() - 1; i++) {
            int tempLongest = 0;
            int l = i, r = i + 1;
            StringBuilder str = new StringBuilder();
            while (l >= 0 && chars[l] == chars[i]) {
                str.append(chars[l]);
                l--;
                tempLongest++;
            }
            while (r < s.length() && chars[r] == chars[i]) {
                str.append(chars[r]);
                r++;
                tempLongest++;
            }
            while (l >= 0 && r < s.length()) {
                if (chars[l] != chars[r]) {
                    break;
                } else {
                    str.insert(0, s.charAt(l));
                    str.append(s.charAt(r));
                    l--;
                    r++;
                    tempLongest = tempLongest + 2;
                }
            }
            if (tempLongest > longest) {
                longest = tempLongest;
                sb = str;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main().longestPalindrome("ababbabba"));
    }
}
