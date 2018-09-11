package dx;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/10 11:22
 */

public class no2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int res = chounumber(index);
        System.out.println(res);
    }

    private static int chounumber(int i){
        int min,x=0,y=0,z=0;
        int[] a = new int[i];
        a[0] = 1;
        for(int count=1;count < i;count ++){
            min = min(a[x]*2,a[y]*3,a[z]*5);
            a[count] = min;
            while(a[x]*2<=min)
                x++;
            while(a[y]*3<=min)
                y++;
            while(a[z]*5<=min)
                z++;
        }
        return a[i-1];
    }

    private static int min(int a, int b, int c) {
        int temp = a > b ? b : a;
        return temp > c ? c : temp;
    }
}

