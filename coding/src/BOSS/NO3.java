package BOSS;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/21 19:55
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class NO3 {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       if(isvald(str)){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
    }
    public static boolean isvald(String str){
        if(str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'||str.charAt(0)==')'){
            return false;
        }
        Stack<Character> s1=new Stack();
        Stack<Character> s2=new Stack();
        char[] chars=str.toCharArray();
        String temp="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                if(temp!=""){
                    if(isvalidnum(temp))
                    s2.push('1');
                }
                s1.push(chars[i]);
                continue;
            }
            if(chars[i]==')') {
                if (s1.peek() == '(') {
                    if (!s2.empty()) {
                        s1.pop();
                        continue;
                    }
                } else {
                    return false;
                }
            }
            if(chars[i]=='+'||chars[i]=='-'||chars[i]=='*'||chars[i]=='/'){
                if(temp!=""){
                    if(isvalidnum(temp))
                        s2.push('1');
                }
                if(s2.size()!=0&&(s2.peek()=='+'||s2.peek()=='-'||s2.peek()=='*'||s2.peek()=='/')){
                        return false;
                }
                else{
                    s2.push(chars[i]);
                    continue;
                }
            }
            if(chars[i]>='0'&&chars[i]<='9'){
                temp=temp+chars[i];
            }else{
                return false;
            }
        }
       return true;
    }
    public static boolean isvalidnum(String s){
        if(s.charAt(0)!='0'){
            return true;
        }else{
            return false;
        }
    }
}
