
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.trim().split("\\s+");
        if (str == null) return sb.toString();
        int start = 0, end = str.length-1;
        while(start < end){
        	String temp = str[start];
        	str[start] = str[end];
        	str[end] = temp;
        	start++;
        	end--;
        }
        for(String temp : str){
        	sb.append(temp + " ");
        }
        
        return sb.toString().trim();
    }
    
    public static void main(String[] args){
    	System.out.print(reverseWords("a      b"));
    }
}
