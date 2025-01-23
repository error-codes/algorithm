package array;

/**
 * @author YoungCR
 * @date 2025/1/7 18:09
 * @descritpion MergeTwoArray
 */
public class MergeTwoArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIdx = m - 1, nIdx = n - 1;
        int cur  = m + n - 1;
        while (mIdx >= 0 || nIdx >= 0) {
            if (mIdx == -1) {
                nums1[cur--] = nums2[nIdx--];
            } else if (nIdx == -1) {
                nums1[cur--] = nums1[mIdx--];
            } else if (nums1[mIdx] < nums2[nIdx]) {
                nums1[cur--] = nums2[nIdx--];
            } else {
                nums1[cur--] = nums1[mIdx--];
            }

        }
    }

}
