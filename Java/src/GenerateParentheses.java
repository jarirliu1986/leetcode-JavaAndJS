import java.util.*;

public class GenerateParentheses {
	
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(list, 0, 0, n, "");
        return list;
    }
    
    public void helper(List<String> list, int left, int right, int max, String str){
        if(str.length() == 2*max){
            list.add(str);
            return;
        }
        
        if(left < max){
            helper(list, left+1, right, max, str+"(");
        }
        if(right < left){
            helper(list, left, right+1, max, str+")");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
