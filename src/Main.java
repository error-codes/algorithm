import java.lang.reflect.Array;
import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {


    public int minimumRecolors(String blocks, int k) {
        char[] colors = blocks.toCharArray();

        int update = Integer.MAX_VALUE;
        int white = 0;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == 'W') {
                white++;
            }
            if (i < k - 1) {
                continue;
            }
            update = Math.min(update, white);
            white = colors[i - k + 1] == 'W' ? white - 1 : white;
        }
        return update;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
    }
}
