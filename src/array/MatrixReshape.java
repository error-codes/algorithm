package array;

import java.util.Arrays;

/**
 * @author YoungCR
 * @date 2025/1/8 20:37
 * @descritpion MatrixReshape
 */
public class MatrixReshape {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];

        int nr = 0, nc = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < col; j++) {
                if (nr < r) {
                    if (nc < c) {
                        res[nr][nc++] = ints[j];
                    } else {
                        nc = 0;
                        res[++nr][nc++] = ints[j];

                    }
                }
            }
        }
        return res;
    }

}
