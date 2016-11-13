import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        String l = "{[(";
        String r = "}])";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
        	char c = s.charAt(i);
        	if(l.contains(String.valueOf(c))){
        		stack.push(c);
        	}else if(r.contains(String.valueOf(c))){
        		if(stack.isEmpty()) return false;
        		char ch = stack.pop();
        		if(l.indexOf(ch) != r.indexOf(c)) return false;
        	}
        }
    	return stack.isEmpty();
    }
    public static void main(String[] args){
    	ValidParentheses r = new ValidParentheses();
    	String s = "{}([]])()";
    	System.out.println(r.isValid(s));
    }
}
