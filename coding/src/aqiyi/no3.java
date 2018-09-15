package aqiyi;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/15 11:15
 */
public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            int num = sc.nextInt();
            if (s.equals("A")) {
                arr[num - 1]++;
            } else {
                arr[num - 1]--;
            }
        }
        int result = arr[P - 1];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                count++;
            }
        }
        System.out.println(count);
    }
}

