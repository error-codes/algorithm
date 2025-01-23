package string;

/**
 * @author YoungCR
 * @date 2025/1/9 19:13
 * @descritpion VerityPalindrome
 */
public class VerityPalindrome {

    public boolean isPalindrome(String s) {
        char[] sCharArray = s.toLowerCase().toCharArray();
        int    l          = 0, r = sCharArray.length - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(sCharArray[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(sCharArray[r])) {
                r--;
                continue;
            }
            if (sCharArray[l++] != sCharArray[r--]) {
                return false;
            }
        }
        return true;
    }
}
