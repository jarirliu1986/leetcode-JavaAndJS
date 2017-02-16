import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
        	char[] ch = str.toCharArray();
        	Arrays.sort(ch);
        	String keyStr = String.valueOf(ch);
        	if(!map.containsKey(keyStr)){
        		map.put(keyStr, new ArrayList<String>());
        	}
        	map.get(keyStr).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
