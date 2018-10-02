package shopee;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/15 18:23
 */
public class no22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars=str.toCharArray();
        for (int i=str.length()-1;i>=1;i--){
            if(i==1&&chars[i]=='0') {
                System.out.println(0);
                return;
            }
            if (chars[i] - chars[i - 1] >= 0) {
                    continue;
                }else{
                    System.out.println(swap2(chars,i,i-1));
                    return;
                }
            }
            System.out.println(0);
        }

    public static String swap2(char[] chars,int i,int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        StringBuffer r=new StringBuffer("");
        for (Character c:chars) {
            r.append(c);
        }
        return r.toString();
    }
}
