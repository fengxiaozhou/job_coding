import java.util.Stack;

public class evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        String[] s=new String[]{"4"};
        System.out.print(evalRPN(s));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")){
                stack.push(Integer.valueOf(tokens[i]));
            }
            if(tokens[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            if(tokens[i].equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }
            if(tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            if(tokens[i].equals("/")){
                int a=stack.pop();
                stack.push(Integer.valueOf(stack.pop().intValue()/a));
            }
        }
        return stack.pop();
    }
}
