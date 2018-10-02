package T;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/16 10:33
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=1;
        for(int i=0;i<n;i++){
            max=max*(i+1);
        }
        for(int i=n+1;i<10000;i++){
            if(LCM(n,i)==LCM(0,i)){
                System.out.println(i);
                return;
            }
        }

    }
    public static int LCM(int a,int b){
        int[] arr=new int[b-a];
        int n=arr.length;
        arr[0]=a+1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+1;
        }
        int max=1;
        for(int i=0;i<n;i++){
            max=max*arr[i];
        }
        for(int i=arr[n-1];i<=max;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(i%arr[j]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                max=i;
                break;
            }
        }
        return max;
    }
}
