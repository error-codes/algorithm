package string;

/**
 * @author YoungCR
 * @date 2025/1/9 18:49
 * @descritpion VaildAnagram
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[]  answer     = new int[26];
        for (char c : s.toCharArray()) {
            answer[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            answer[c - 'a']--;
        }
        for (int i : answer) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
