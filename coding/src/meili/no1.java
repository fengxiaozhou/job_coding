package meili;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/27 19:36
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=Math.max(n,m);
        int s=n+m;
        int a=1;
        int b=1;
        for(int i=s;i>=max;i--){
            a=a*i;
        }
        for(int i=max;i>0;i--){
            b=b*i;
        }
        System.out.println(a/b);
    }
}
