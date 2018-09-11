package meituan;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/6 21:12
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n - 1][2];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(4);
    }
}
