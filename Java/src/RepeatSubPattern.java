
public class RepeatSubPattern {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null || s.length() == 0) return false;
        
        int len = s.length();
        for(int i = len/2; i >= 1; i--){
        	if(len%i == 0){
        		String sub = s.substring(0, i);
        		StringBuilder sb = new StringBuilder();
        		for(int j=0; j<len/i; j++){
        			sb.append(sub);
        		}
        		if(s.equals(sb.toString()))
        			return true;
        	}
        }
    	
    	return false;
    }
    
}
