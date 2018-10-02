package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/25 10:13
 */
public class 不用加减乘除做加法 {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        System.out.println(Add(a,b));
    }
    public static int Add(int num1,int num2) {
        int sum=num1^num2;
        int temp=(num1&num2)<<1;
        while (true){
            if(temp==0){
                return sum;
            }
            sum=sum^temp;
            temp=(sum&temp)<<1;
        }
    }
}
