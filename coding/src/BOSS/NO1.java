package BOSS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/21 19:16
 */
public class NO1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        int res=Integer.MIN_VALUE;
        StringBuffer temp=new StringBuffer();
        for (int i=0;i<str.length();i++){
            if((temp.length()==0)&&(chars[i]<'0'||chars[i]>'9')){
                continue;
            }
            if(chars[i]<'0'||chars[i]>'9'){
                if(Integer.valueOf(temp.toString())>res){
                    res=Integer.valueOf(temp.toString());
                }
                temp.delete(0,temp.length());
                continue;
            }
            temp.append(chars[i]);
        }
        System.out.println(res);

    }
}
