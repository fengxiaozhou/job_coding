package xunlei;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gougushu(sc.nextInt()));

    }
    public static int gougushu(int maxnum) {
        int num = 0;
        for (int i = 1; i <=maxnum; i++) {
            for (int j = i; j <= maxnum; j++) {
                for (int n = j + 1; n <= maxnum; n++) {
                    if ((i*i + j * j) == n * n) {
                        if (issu(i, j, n)) {
                            num++;
                        }
                    }
                }
            }
        }
        return num;
    }
    private static boolean issu(int i, int j, int n) {
        return issu(i, j) && issu(i, n) && issu(j, n);
    }

    private static boolean issu(int i, int j) {
        int r;
        do {
            r = i % j;
            i = j;
            j = r;
        } while (r != 0);
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }
}
