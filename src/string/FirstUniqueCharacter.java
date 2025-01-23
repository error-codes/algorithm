package string;

/**
 * @author YoungCR
 * @date 2025/1/9 19:57
 * @descritpion FirstUniqueCharacter
 */
public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        int[] ans = new int[26];
        char[] sCharArray = s.toCharArray();
        for (char c : sCharArray) {
            ans[c - 'a']++;
        }

        for (int i = 0; i < sCharArray.length; i++) {
            if (ans[sCharArray[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
