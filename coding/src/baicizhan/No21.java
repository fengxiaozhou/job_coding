package baicizhan;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/11 13:02
 */
public class No21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Boolean res=true;
        if(n==1){
            System.out.println(res);
            return;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }
}
