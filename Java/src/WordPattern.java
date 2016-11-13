
import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
    	String[] val = str.split(" ");
    	if(pattern.length() != val.length){
    		return false;
    	}
    	Map<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
        	if(!map.containsKey(pattern.charAt(i)) && map.containsValue(val[i])){
        		return false;
        	}else if(!map.containsKey(pattern.charAt(i))){
        		map.put(pattern.charAt(i), val[i]);
        	}else if(!map.get(pattern.charAt(i)).equals(val[i])){
        		return false;
        	}
        }
    	return true;
    }
	public static void main(String[] args){
		String pattern = "abba";
		String str = "dog dog dog dog";
		WordPattern r = new WordPattern();
		System.out.println(r.wordPattern(pattern, str));
	}
}
