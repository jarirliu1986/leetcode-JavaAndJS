

	public class ReverseString {
	    public static String reverseString(String s) {
	        StringBuffer sb = new StringBuffer();
	        for(int i=s.length()-1; i >= 0; i--){
	        	sb = sb.append(s.charAt(i));
	        }
	    	return sb.toString();
	    }
		public static void main(String[] args) {
			String s = "asfrg";
			System.out.println(reverseString(s));

		}
	}




