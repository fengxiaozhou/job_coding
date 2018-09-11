package baicizhan;

import java.lang.management.MonitorInfo;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/9 15:26
 */
public class no3 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s1=sc.next();
//        String s2=sc.next();
//        Long a=StoI(s1)+StoI(s2);
        System.out.println("a:"+StoI("bhe"));
        System.out.println("a:"+ItoS(862L));
    }
    public static Long StoI(String s){
        if(s==null||s.length()==0){
            return 0L;
        }
        Long res=0L;
        for (int i=0;i<s.toCharArray().length-1;i++){
            res=(res+(s.toCharArray()[i]-'a'))*26;
        }
        res=res+(s.toCharArray()[s.toCharArray().length-1]-'a');
        System.out.println(res);
        return res;
    }
    public static String ItoS(Long n){
        StringBuffer res=new StringBuffer("");
        while (n>0){
            res.insert(0,(char)('a'+n%26));
            n=n/26;
        }
        return res.toString();
    }
}
