import java.lang.reflect.Array;
import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {

    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int l = i + 1, r = arr.length - 1;
                while (l < r) {
                    if (l > i + 1 && arr[l] == arr[l - 1]) {
                        l++;
                    } else if (r < arr.length - 1 && arr[r] == arr[r + 1]) {
                        r--;
                    } else if (arr[l] + arr[r] > -arr[i]) {
                        r--;
                    } else if (arr[l] + arr[r] < -arr[i]) {
                        l++;
                    } else {
                        result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                        l++;
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
