package dx;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/10 9:53
 */
public class no3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a==null||b==null||a.length()==0||b.length()==0){
            System.out.println(0);
            return;
        }
        int len=Math.min(a.length(),b.length());
        int s1=repetition(a,b,len);
        int s2=repetition(b,a,len);
        System.out.println(Math.max(s1,s2));
    }
    public static int repetition(String s1,String s2,int n){
        int count=0;
        for(int i=0;i<n;i++){
            String str1=s1.substring(s1.length()-1-i, s1.length());
            String str2=s2.substring(0,i+1);
           if(str1.equals(str2)){
               int k=i+1;
               count=Math.max(count,k);
           }
        }
        return count;
    }
}
