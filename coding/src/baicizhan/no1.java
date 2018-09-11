package baicizhan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/9 15:04
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(reverse(s));
        }

    public static int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int temp = x;
        long ret = 0;
        if(x < 0) temp = -temp;
        while(temp/10 != 0){
            ret = ret*10 + temp%10;
            temp /= 10;
        }
        ret = ret*10 + temp%10;
        if(x < 0) return -(int)ret;
        return (int)ret;
    }

}
