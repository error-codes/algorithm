import java.util.HashMap;
import java.util.Map;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {


    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int count = 0;
        int[] ans = new int[nums.length - k + 1];
        int
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                continue;
            }


        }
    }

    public static void main(String[] args) {
        int freq = new Main().maxFreq("aababcaab", 2, 3, 4);
        System.out.println(freq);
    }

}
