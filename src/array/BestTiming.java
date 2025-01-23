package array;

/**
 * @author YoungCR
 * @date 2025/1/7 20:03
 * @descritpion BestTiming
 */
public class BestTiming {

    public int bestTiming(int[] prices) {
        int timing = 0;
        int min    = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            timing = Math.max(timing, prices[i] - min);
        }
        return timing;
    }
}
