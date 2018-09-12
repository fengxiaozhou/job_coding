package xunlei;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/12 19:33
 */
public class no2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=0;
        int sum=0;
        int count=0;
        while(sum<b){
            sum+=a;
            count++;
        }
        if((6*a+b)<0){
             res=15*a+2*b;
        }else if((6*a+b)>0){
             res=13*a+4*b;
        }
        System.out.println(res);

    }
}
