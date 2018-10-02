package kuaishou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/25 19:53
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=function(arr);
        System.out.println(res);
    }
    public static int function(int[] arr){
        if(arr==null||arr.length<2) return 0;
        if(arr.length==2){
            if(arr[0]!=arr[1]){
                return 0;
            }else{
                return arr[0];
            }
        }
        int pre=0;
        int last=arr.length-1;
        int max=0;
        int sum1=0;
        int sum2=0;
        sum1=sum1+arr[pre];
        sum2=sum2+arr[last];
        while(pre<last){
            if(sum1==sum2){
                max=Math.max(max,sum1);
                last--;
                pre++;
                sum1=sum1+arr[pre];
                sum2=sum2+arr[last];
            }
            if(sum1>sum2){
                last--;
                sum2=sum2+arr[last];
            }
            if(sum1<sum2){
                pre++;
                sum1=sum1+arr[pre];
            }
        }
        return max;

    }
}
