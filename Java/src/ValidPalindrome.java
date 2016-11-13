
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0, j = s.length()-1;
    	while(i<j){
    		char a = chars[i];
    		char b = chars[j];
    		if(!isAlphabet(a)){
    			i++;
    			continue;
    		}
    		if(!isAlphabet(b)){
    			j--;
    			continue;
    		}
    		if(a == b){
    			i++;
    			j--;   			
    		}else{
    			return false;
    		}
    	}
    	return true;
    }
    protected boolean isAlphabet(char c){

    	if(c >= 'a' && c <= 'z'){
    		return true;
    	}
    	if(c >= '0' && c <= '9'){
    		return true;
    	}
    	return false;
    } 
    public static void main(String[] args){
    	ValidPalindrome v = new ValidPalindrome();
    	String s = "0P";
    	System.out.println(v.isPalindrome(s));
    }
}