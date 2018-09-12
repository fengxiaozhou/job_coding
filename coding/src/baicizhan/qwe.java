package baicizhan;

import java.util.Scanner;

/**

 * find k from n, to make sum(k) equals m.

 *

 */

public class qwe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(containValue(arr, k));
    }

    public static Boolean containValue(int[] a, int value){
        boolean flag=false;
        for(int i=1; i<=a.length; i++){
            int[] b = new int[i];
            if(find(a, a.length, i, value, b)){
                flag=true;
                break;
            }
        }
        return flag;
    }



    private static Boolean find(int[] a, int n, int m, int value, int[] b){
        boolean flag=false;
        for(int i=n; i>=m; i--){
            b[m-1] = i - 1 ;
            if(m > 1){
                if(find(a, i-1, m-1, value, b)){
                    return true;
                };
            }else{
                if(testEquals(a, b, value)){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }



    private static Boolean testEquals(int[] a, int[] b, int value){
        int sum = 0;
        for(int i=0; i<b.length; i++){
            sum += a[b[i]];
        }
        if(sum == value){
            return true;
        }
        return false;
    }
}
