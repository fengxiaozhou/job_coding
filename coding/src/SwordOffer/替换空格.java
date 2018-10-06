package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/6 14:19
 */
public class 替换空格 {
    public static void main(String[] args) {
        replaceSpace(new StringBuffer("we we we"));
    }
    public static String replaceSpace(StringBuffer str) {
       String res=str.toString().replaceAll(" ","%20");
       return res;
    }
}
