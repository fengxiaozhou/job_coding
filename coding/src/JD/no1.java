package JD;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]  num= new int[n][3];
        for (int i = 0; i < n; i++) {
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
            num[i][2] = sc.nextInt();
        }
        int unqualified = 0;
        for (int i = 0; i < n; i++) {
            int ai = num[i][0];
            int bi = num[i][1];
            int ci = num[i][2];
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                if (ai < num[j][0] && bi < num[j][1] && ci < num[j][2]) {
                    unqualified++;
                    break;
                }
            }
        }
        System.out.println(unqualified);
    }
}

