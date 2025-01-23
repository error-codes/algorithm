package string;

/**
 * @author YoungCR
 * @date 2025/1/9 20:18
 * @descritpion StringMatchFirstIndex
 */
public class StringMatchFirstIndex {

    public int strStr(String haystack, String needle) {
        int nLength = needle.length();

        char[] hArray = haystack.toCharArray();
        char[] nArray = needle.toCharArray();

        int[] pmt = computePrefixTable(nArray);

        for (int i = 0, j = 0; i < hArray.length; i++) {
            while (j > 0 && hArray[i] != nArray[j]) {
                j = pmt[j - 1];
            }
            if (hArray[i] == nArray[j]) {
                j++;
            }
            if (j == nLength) {
                return i - nLength + 1;
            }
        }
        return -1;
    }

    public int[] computePrefixTable(char[] pattern) {
        int   length = pattern.length;
        int[] pmt    = new int[length];

        int j = 0;
        for (int i = 1; i < length; i++) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = pmt[j - 1];
            }
            if (pattern[i] == pattern[j]) {
                j++;
            }
            pmt[i] = j;
        }
        return pmt;
    }

}
