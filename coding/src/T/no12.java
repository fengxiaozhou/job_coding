package T;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/16 11:21
 */
public class no12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumpre=1;
        for(int i=1;i<=n;i++){
            sumpre=sumpre*i;
        }
        int sumafter=1;
        for(int i=n+1;i<Integer.MAX_VALUE;i++){
            for(int j=n+1;j<=i;j++){
                sumafter=sumafter*j;
            }
            if(sumafter%sumpre==0){
                System.out.println(i);
                return;
            }
         }
    }
}
