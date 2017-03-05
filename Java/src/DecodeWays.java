
public class DecodeWays {
//    public static int numDecodings(String s) {
//        if(s == null || s.length() == 0) return 0;
//        
//        int[] res = new int[s.length()+1];
//        res[0] = 1; res[1] = 1; 
//        for(int i=2; i <= s.length(); i++){
//        	int val = Integer.parseInt(s.substring(i-2, i));
//        	res[i] = val<=26 ? res[i-1]+res[i-2] : res[i-1];
//        }
//        
//        return res[s.length()];
//    }
    public static int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        int[] memo = new int[n+1];
        memo[n]  = 1;
        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
        
        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];
        
        return memo[0];
    }
    
    public static void main(String[] args){
    	System.out.println(numDecodings("0"));
    }
}
