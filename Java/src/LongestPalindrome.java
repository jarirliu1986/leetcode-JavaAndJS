
public class LongestPalindrome {
	
    public static String longestPalindrome(String s) {
        if(s == null || s.length() ==0) return null;
        
        int n = s.length();
        int len=0, start=0;
        boolean[][] res = new boolean[n][n];
              
        for(int j=0; j<n; j++){
        	for(int i=0; j+i<n; i++){
        		char c1 = s.charAt(i), c2 = s.charAt(i+j);
        		
        		if(j > 1){
        			res[i][i+j] = c1==c2? res[i+1][i+j-1] : false;
        		}else{
        			if(i<n-1){
            			res[i][i+j] = c1==c2? true:false;
            		}
        			res[i][i] = true;
        		}	
        		
        		if(res[i][i+j]==true && len < j){
        			start = i;
        			len = j;
        		}
        		//System.out.println("i, j " + i + ", " +j + " res: " + res[i][i+j]);
        	}
        }
        
        return s.substring(start, start+len+1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abcba"));

	}

}
