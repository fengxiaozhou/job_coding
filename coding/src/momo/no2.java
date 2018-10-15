package momo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/10/10 18:32
 */
public class no2 {
    static ArrayList<String> arr=new ArrayList();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printAllPermutations1(str);
        Collections.sort(arr);
        for (String s:arr) {
            System.out.println(s);
        }
    }
    public static void printAllPermutations1(String str) {
        char[] chs = str.toCharArray();
        process1(chs, 0);
    }

    public static void process1(char[] chs, int i) {
        if (i == chs.length) {
            arr.add(String.valueOf(chs));
        }
        for (int j = i; j < chs.length; j++) {
            swap(chs, i, j);
            process1(chs, i + 1);
            swap(chs, i, j);
        }
    }
    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}
