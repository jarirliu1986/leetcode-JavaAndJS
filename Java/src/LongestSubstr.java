import java.util.*;
public class LongestSubstr {
	
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0, len=0;
        for(int i=0; i < s.length(); i++){
        	char key = s.charAt(i);
        	if(map.containsKey(key)){
        		start = Math.max(map.get(key)+1, start);
        	}
        	len = Math.max(len, i-start+1);
        	map.put(key, i);
        	
        }
    	return len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstr s = new LongestSubstr();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
	}

}
