
public class NumOfSegmentInString {
	public static int countSegments(String s){
		// return (s + " x").split(" +").length - 1;
		
		//return (s+" ").split("//S+").length;
		if(s == null || s.length() == 0) return 0;
		
	    int res=0;
	    for(int i=0; i<s.length(); i++)
	        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
	            res++;        
	    return res;
		
	}
	
	public static void main(String[] args){
		System.out.println(countSegments(""));
	}
}
