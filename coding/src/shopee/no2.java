package shopee;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/15 17:52
 */
public class no2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars=str.toCharArray();
        String comp="";
        for (int i=str.length()-1;i>=1;i--){
             comp=swap(chars,i,i-1);
             if(str.compareTo(comp)>=1){
                 System.out.println(comp);
                 return;
             }else{
                 swap2(chars,i,i-1);
             }
        }
        System.out.println(0);
    }
    public static String swap(char[] chars,int i,int j){
         char temp=chars[i];
         chars[i]=chars[j];
         chars[j]=temp;
         StringBuffer r=new StringBuffer("");
        for (Character c:chars) {
            r.append(c);
        }
        if(r.charAt(0)=='0'){
            return r.substring(1);
        }
        return r.toString();
    }
    public static void swap2(char[] chars,int i,int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
