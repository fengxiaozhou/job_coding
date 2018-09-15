package aqiyi;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/15 10:01
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(isE(s)>0){
            System.out.println(isE(s));
        }
        int cur=isluck(s);
        if(cur==0){
            System.out.println(0);
        }else if(cur>18&&cur<=27){
            System.out.println(3);
        }else if(cur<=18&&cur>9){
            System.out.println(2);
        }else {
            System.out.println(1);
        }

    }
    public static int isluck(String s){
        char[] chars=s.toCharArray();
        int a=(chars[0]-'0')+chars[1]-'0'+chars[2]-'0';
        int b=(chars[s.length()-1]-'0')+chars[s.length()-2]-'0'+chars[s.length()-3]-'0';
        return a-b;
    }
    public static int isE(String s){
        char[] chars=s.toCharArray();
        if((chars[0]-'0'==chars[1]-'0'&&chars[1]-'0'==chars[2]-'0')&&(chars[s.length()-1]-'0'==chars[s.length()-2]-'0'&&chars[s.length()-3]-'0'==chars[s.length()-2]-'0')){
            int a=(chars[0]-'0')+chars[1]-'0'+chars[2]-'0';
            int b=(chars[s.length()-1]-'0')+chars[s.length()-2]-'0'+chars[s.length()-3]-'0';
            if(Math.abs(a-b)<=9&&Math.abs(a-b)>0){
                return 1;
            }else if(Math.abs(a-b)<=18){
                return 2;
            }else {
                return 3;
            }
        }
        return 0;
    }
}
