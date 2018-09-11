package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/6 17:54
 */
public class StringCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s==null||s.length()==0)
            System.out.println("");
        List list=new ArrayList();
        char index=s.charAt(0);
        int num=1;
        for(int i=1;i<s.length();i++){
            if(index!=s.charAt(i)){
                list.add(num);
                list.add(index);
                index=s.charAt(i);
                num=0;
            }
            num++;
        }
        list.add(num);
        list.add(s.charAt(s.length()-1));
        StringBuffer res=new StringBuffer();
        for (Object a:list) {
            res.append(a);
        }
        System.out.println(res);
    }
}
