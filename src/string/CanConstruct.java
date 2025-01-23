package string;

/**
 * @author YoungCR
 * @date 2025/1/14 20:18
 * @descritpion CanConstruct
 */
public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            --count[c - 'a'];
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
