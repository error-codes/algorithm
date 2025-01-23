package array;

/**
 * @author YoungCR
 * @date 2025/1/8 19:41
 * @descritpion AddOne
 */
public class AddOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
