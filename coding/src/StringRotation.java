import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StringRotation {
    public String rotateString(String A, int n, int p) {
        // write code here
        String a = A.substring(p + 1, n);
        String b = A.substring(0, p + 1);
        return a + b;
    }

    public int[] printMatrix(int[][] mat, int n, int m) {
        ArrayList<Integer> res = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    res.add(mat[i][j]);
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    res.add(mat[i][j]);
                }
            }
        }
        int[] a = new int[m * n];
        int k = 0;
        for (int x : res) {
            a[k] = x;
            k++;
        }
        return a;
    }
}
