import java.util.Stack;

/**
 * @author Fz
 * @date 2018/8/20 20:41
 */
public class longest_valid_parentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()()(((()))"));
    }
    public static int longestValidParentheses(String s) {
        if(s==null||s.length()<=0){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int max=0;
        int last=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    last=i;
                }else{
                    stack.pop();
                    if(stack.isEmpty())
                        max=Math.max(max,i-last);
                    else
                        max=Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }

}
