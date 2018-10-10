package SwordOffer;

import java.util.Stack;

/**
 * @author Fz
 * @date 2018/10/8 19:38
 */
public class 包含min函数的栈 {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public void push(int node) {
        s1.push(node);
        if(s2.empty()){
            s2.push(node);
        }else if(s2.peek()>node){
            s2.push(node);
        }else{
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
