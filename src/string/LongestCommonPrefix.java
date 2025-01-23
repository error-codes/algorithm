package string;

/**
 * @author YoungCR
 * @date 2025/1/13 15:41
 * @descritpion LongestCommonPrefix
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int min = 0, max = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[min].compareTo(strs[i]) > 0) {
                min = i;
            }
            if (strs[max].compareTo(strs[i]) < 0) {
                max = i;
            }
        }

        for (int i = 0; i < strs[max].length(); i++) {
            if (strs[min].charAt(i) != strs[max].charAt(i)) {
                return strs[max].substring(0, i);
            }
        }
        return "";
    }
}
