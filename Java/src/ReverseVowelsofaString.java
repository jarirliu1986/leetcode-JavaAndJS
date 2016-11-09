
public class ReverseVowelsofaString {
	
    public static String reverseVowels(String s) {
    	StringBuffer sb = new StringBuffer(s);
    	int front = 0, end = s.length()-1;
    	while(front < end){
    		boolean flag1 = isVowel(sb.charAt(front));
    		boolean flag2 = isVowel(sb.charAt(end));
    		if(!flag1){
    			front++;
    		}
    		if(!flag2){
    			end--;
    		}
    		if(flag1 & flag2){
    			char temp = sb.charAt(end);
    			sb.setCharAt(end, sb.charAt(front));
    			sb.setCharAt(front, temp);
    			front++;
    			end--;
    		}
    	}
        return sb.toString();
    }
    public static boolean isVowel(char c){
    	if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u'){
    		return true;
    	}
    	if(c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U'){
    		return true;
    	}
    	return false;
    }

	public static void main(String[] args) {
		String s = "auioeee";
		System.out.println(s);
		System.out.println(reverseVowels(s));

	}

}
