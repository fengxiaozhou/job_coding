import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n<1||n>10000) return;
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
            if(arr[i]<1||arr[i]>1000) return;
            max+=arr[i];
        }
        int m=in.nextInt();
        if(m<1||m>10000) return;
        int[] brr=new int[n];
        for(int i=0;i<m;i++) {
            brr[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            int num=0;
            int sum=0;
            if(brr[i]>max){
                return;
            }
            for(int j=0;j<n;j++){
                sum=sum+arr[j];
                if(brr[i]<=sum){
                    num=j+1;
                    break;
                }
            }
            System.out.println(num);
        }
    }
}
