package SwordOffer;

import java.util.Stack;

/**
 * @author Fz
 * @date 2018/10/8 19:57
 */
public class 栈的压入_弹出序列 {
    public static void main(String[] args) {
        int[] pushA=new int[]{1,2,3,4,5};
        int[] popA=new int[]{4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int j=0;
        int pushl=pushA.length;
        int popl=popA.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<pushl;i++){
            s.push(pushA[i]);
            while(!s.empty()&&popA[j]==s.peek()){
                s.pop();
                j++;
            }
        }
        return s.empty();
    }
}
