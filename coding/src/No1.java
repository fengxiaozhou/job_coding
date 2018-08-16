import java.util.LinkedList;
import java.util.Scanner;

public class No1 {
    static LinkedList<String> map=new LinkedList<String>();
    static boolean t=false;
    static int number=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {//注意while处理多个case
            arr[i]=in.nextInt();
        }
        if(k==0){
            return;
        }
        while(t==false&&k>0){
            number++;
            find(arr);
            k--;
        }
        int max=Max(arr);
        int min=Min(arr);
        System.out.println(max-min+" "+number);
        for (String s:map) {
            System.out.println(s);
        }


    }
    public static void find(int[] arr){
        int max=Max(arr);
        int min=Min(arr);
        if(arr[max]!=arr[min]) {
            map.add(String.valueOf(max+1)+" "+(min+1));
            arr[max]--;
            arr[min]++;
        }else{
            t=true;
    }
    }
    public static int Max(int[] arr){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[0]<arr[i]){
                res=i;
            }
        }
        return res;
    }
    public static int Min(int[] arr){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[0]>arr[i]){
                res=i;
            }
        }
        return res;
    }
}
