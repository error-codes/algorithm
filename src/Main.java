import java.lang.reflect.Array;
import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {


    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;
        int score    = 0;

        // 因为只能从左右两边开始取，那其实可以将这副牌看成一个环状
        // 从左边一直拿，或者从右边一直拿，分别是两个极限
        for (int i = cardPoints.length - k; i < cardPoints.length + k; i++) {
            score += cardPoints[i % cardPoints.length];
            if (i < cardPoints.length - 1) {
                continue;
            }
            maxScore = Math.max(maxScore, score);
            if (i == cardPoints.length + k - 1) {
                break;
            }
            score -= cardPoints[i - k + 1];
        }

        return maxScore;
    }


    public static void main(String[] args) {
        System.out.println(new Main().maxScore(new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30}, 8));
    }
}
