import java.math.BigInteger;
import java.util.Scanner;

public class Nest_Xing_ji_chuan_yue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        System.out.print((int)(Math.pow(h+0.25,0.5)-0.5));
    }
}
