package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/6 15:02
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(0));
    }

    public static int Fibonacci(int n) {
       int[] arr=new int[n+3];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
