package dx;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/10 10:56
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (char c:s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
            min=Math.min(min,map.get(c));
        }
        String res="";
        for (char c:s.toCharArray()){
            if(map.get(c)!=min){
                res=res+c;
            }
        }
        System.out.println(res);

    }
}
