import java.util.Stack;

/**
 * @author Fz
 * @date 2018/8/20 20:49
 */
public class valid_parentheses {
    public boolean isValid(String s) {
        if(s.length()<2) return false;
        Stack<Character> stack=new Stack();
        for (char c:s.toCharArray()) {
            if(c=='{'||c=='['||c=='(')
                stack.push(c);
            if(c=='}'){
                if(stack.size()==0) return false;
                if(stack.pop()!='{')
                    return false;
            }
            if(c==']'){
                if(stack.size()==0) return false;
                if(stack.pop()!='[')
                    return false;
            }
            if(c==')'){
                if(stack.size()==0) return false;
                if(stack.pop()!='(')
                    return false;
            }
        }
        return stack.empty();
    }
}
