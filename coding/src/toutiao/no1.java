package toutiao;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/20 20:36
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s==null||s.length()==0){
            return;
        }
        String[] strings=s.split("/");
        if(strings==null||strings.length==0){
            return;
        }
        String res=strings[strings.length-1];
        System.out.println("/"+res);

    }
}
