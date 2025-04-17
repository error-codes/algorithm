import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().bubbleSort(new int[]{7, 4, 8, 1, 3, 2, 5, 6})));
    }

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int minIdx = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                    swap(arr, minIdx, j);
                }
            }
        }

        return arr;
    }

    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        return arr;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
