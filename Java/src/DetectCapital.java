

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() <= 1) return true;
        
        String sub = word.substring(1);
        if(word.charAt(0) == Character.toLowerCase(word.charAt(0)) && sub.equals(sub.toLowerCase()))
        	return true;
        if(word.charAt(0) == Character.toUpperCase(word.charAt(0)) && (sub.equals(sub.toLowerCase()) || sub.equals(sub.toUpperCase())))
        	return true;
        
    	return false;
    }
}