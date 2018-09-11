package Nets;

import org.omg.CORBA.MARSHAL;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/8 16:09
 */
public class no3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m=sc.nextInt();
    int[][] arr = new int[n][2];
    int num[]=new int[m+1];
    int candy=0;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        arr[i][0]=sc.nextInt();
        num[arr[i][0]]++;
        arr[i][1]=sc.nextInt();
    }
    if(ismost(num)){
        System.out.println(candy);
    }else {
        while (!ismost(num)) {
            int flag=0;
            for (int i = 1; i < m; i++) {
                if(num[arr[i][0]]==0){
                    continue;
                }
                if (arr[i][0] == 1) {
                    continue;
                }
                min = Math.min(min, arr[i][1]);
                if(min==arr[i][1]){
                    flag=i;
                }
            }
            num[flag+1]--;
            num[1]++;
            candy=candy+arr[flag][1];
            arr[flag][1]=Integer.MAX_VALUE;
            min=Integer.MAX_VALUE;
        }
        System.out.println(candy);
    }


    }
    public static boolean ismost(int[] num){
        for(int i=2;i<num.length;i++){
            if(num[1]<=num[i])
                return false;
        }
        return true;
    }
}
