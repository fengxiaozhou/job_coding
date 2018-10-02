package BOSS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/21 19:34
 */
public class No2 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res=sc.next();
        for (String s:res.split(",")) {
           set.add(s);
        }
        set.add("0");
        num++;
        while(!isvalid(num,set)){
            num++;
        }
        System.out.println(num);
        return;
    }

    public static boolean isvalid(int num,HashSet<String> set){
        char[] chars=String.valueOf(num).toCharArray();
        boolean res=true;
        for (char c:chars) {
            if(set.contains(String.valueOf(c))){
                res=false;
                break;
            }
        }
        return res;
    }
}
