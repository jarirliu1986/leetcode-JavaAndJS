import java.util.*;

public class FindAllAnagramsinaString {
	
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if(s == null || s.length() < p.length()) return list;
        
        int len = p.length();
        char[] temp = p.toCharArray();
        Arrays.sort(temp);
        String target = String.valueOf(temp);
        for(int i=0; i <= s.length()-len; i++){
        	String subStr = s.substring(i, i+len);
        	char[] ch = subStr.toCharArray();
        	Arrays.sort(ch);
        	String compare = String.valueOf(ch);
        	if(target.equals(compare)) list.add(i);
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
