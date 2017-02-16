
import java.util.*;


public class FindAllAnagramsinaStringI {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> list = new ArrayList<>();
//        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
//        int[] hash = new int[256]; //character hash
//        //record each character in p to hash
//        for (char c : p.toCharArray()) {
//            hash[c]++;
//        }
//        //two points, initialize count to p's length
//        int left = 0, right = 0, count = p.length();
//        while (right < s.length()) {
//
//            if (hash[s.charAt(right++)]-- >= 1) count--; 
//            
//            if (count == 0) list.add(left);
//        
//            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
//        }
//        return list;
//    }

	public List<Integer> findAnagrams(String s, String p){
		List<Integer> list = new ArrayList<>();
		if(s == null || s.length() < p.length()) return list;
		Map<Character, Integer> map = new HashMap<>();
		for(char c : p.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		int left=0, right=0, count = p.length();
		while(right < s.length()){
			char rChar = s.charAt(right++);
			if(map.containsKey(rChar)){
				if(map.get(rChar) > 0) count --;
				map.put(rChar, map.get(rChar)-1);
			}
			if(count == 0) list.add(left);
			
			
			if(right -left == p.length() ) {
				char lChar = s.charAt(left);
				if(map.containsKey(lChar)){
					int value = map.get(lChar)+1;
					map.put(lChar, value);
					if(value > 0)count++;
				}
				left++;
			}
			
		}
		
		return list;
	}
	public static void main(String[] args) {
		double a = Math.pow(2, 3);
		System.out.println(a);

	}
}
