import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {


    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int k = s1.length();
        int l = s2.length();
        if (k > l) {
            return false;
        }
        for (int i = 0; i < k; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        for (int i = k; i <= l; i++) {
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
            s2Count[s2.charAt(i - k) - 'a']--;
            s2Count[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(s1Count, s2Count);
    }


    public static void main(String[] args) {
        System.out.println(new Main().checkInclusion("adc", "dcda"));
    }

}
