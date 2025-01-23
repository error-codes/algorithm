package string;

/**
 * @author YoungCR
 * @date 2025/1/13 17:21
 * @descritpion CompressString
 */
public class CompressString {

    public int compress(char[] chars) {
        int write = 0, current = 0, length = chars.length;
        while (current < length) {
            char first = chars[current];
            chars[write++] = first;
            int count = 0;
            while (current < length && chars[current] == first) {
                count++;
                current++;
            }
            if (count > 1) {
                int start = write;
                int end = start;
                while (count > 0) {
                    chars[end++] = (char) (count % 10 + '0');
                    count /= 10;
                }
                while (start < end - 1) {
                    char temp = chars[start];
                    chars[start] = chars[end - 1];
                    chars[end - 1] = temp;
                    start++;
                    write--;
                }
                write = end;
            }
        }
        return write;
    }

}
