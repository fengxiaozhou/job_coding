package didi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/18 20:32
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String flag=sc.next();
        ArrayList<String> arr=new ArrayList<>();
        while (sc.hasNext()){
            arr.add(sc.next());
        }
        int min=Integer.MAX_VALUE;
        HashSet<Character> s1=new HashSet();
        HashSet<Character> s2=new HashSet();
        String string1="qwertasdfgzxcv";
        String string2="yuiophjklbnm";
        for (Character c:string1.toCharArray()) {
            s1.add(c);
        }
        for (Character c:string2.toCharArray()) {
            s2.add(c);
        }
        ArrayList<String> res=new ArrayList<>();
        for (String s:arr) {
            int num=Math.min(Math.min(de(flag,s),in(flag,s)),sub(flag,s,s1,s2));
            if(num<min){
                res.clear();
                res.add(s);
            }else if(num==min){
                res.add(s);
            }
        }
        res.add(0,flag);
        for (String s:res) {
            System.out.println(s);
        }

    }
    public static int de(String flag,String s){
        int res=Integer.MAX_VALUE;
        if(s.contains(flag)){
            return (s.length()-flag.length())*3;
        }
        return res;
    }
    public static int in(String flag,String s){
        int res=Integer.MAX_VALUE;
        if(flag.contains(s)){
            return (flag.length()-s.length())*3;
        }
        return res;
    }
    public static int sub(String flag,String s,HashSet s1,HashSet s2){
        int res=Integer.MAX_VALUE;
        int num=0;
        if(flag.length()!=s.length()){
            return res;
        }else{
            for (Character c:flag.toCharArray()) {
                for (Character x:s.toCharArray()){
                    if(c!=x){
                        if((s1.contains(c)&&s1.contains(x))||(s2.contains(c)&&s2.contains(x))){
                            num=num+1;
                        }else{
                            num=num+2;
                        }
                    }
                }
            }
        }
        return num;
    }
}
