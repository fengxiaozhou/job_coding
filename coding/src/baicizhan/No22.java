package baicizhan;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/11 13:06
 */
public class No22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(isvald(arr,0,0,k));
    }
    public static boolean isvald(int[] arr,int i,int sum,int k){
        if(i==arr.length){
            return sum==k;
        }
        return isvald(arr,i+1,sum+arr[i],k)||isvald(arr,i+1,sum,k);
    }
}
