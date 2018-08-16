import java.util.ArrayList;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<n+1;i++) {
            arr[i]=in.nextInt()+arr[i-1];
        }
        int m=in.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++) {
            b[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            int l=1;
            int r=n+1;
            int res=0;
            while(l<r){
                int mid=(l+r)/2;
                if(arr[mid]>b[i]){
                    r=mid-1;
                    res=mid;
                }else{
                    l=mid+1;
                }
            }
            System.out.println(res);
        }
    }
}
