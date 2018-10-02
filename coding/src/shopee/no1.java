package shopee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/15 17:33
 */
public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Boolean flag=true;
        if(str.charAt(0)=='-'){
            flag=false;
            str=str.substring(1);
        }
        char[] chars=str.toCharArray();
        ArrayList<Character> arr=new ArrayList<>();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            arr.add(0,chars[i]);
            count++;
            if(count==3){
                arr.add(0,',');
                count=0;
            }
        }
        if(arr.get(0).equals(',')){
            arr.remove(0);
        }
        StringBuffer res=new StringBuffer("");
        for (Character c:arr) {
            res.append(c);
        }
        if (flag==false){
            res.insert(0,'-');
        }
            System.out.println(res);
    }
}
