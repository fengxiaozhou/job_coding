package momo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/10/10 18:41
 */
public class no3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr[i+n]=arr[i];
        }
        int i=sc.nextInt();
        int m=sc.nextInt();
        if(m>=n) {
            System.out.println(findmax(arr, i));
        }else{
            System.out.println(findmax(Arrays.copyOfRange(arr,0,m), i));
        }

    }
    public static int findmax(int arr[],int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i-j<=k) {
                    max = arr[i] * arr[j] > max ? arr[i] * arr[j] : max;
                }else{
                    break;
                }
            }
        }
        return max;
    }
}
