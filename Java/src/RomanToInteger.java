
public class RomanToInteger {
    static final int[]  N = { 1 ,  5,  10,  50,  100,  500,  1000 };
    static final char[] C = {'I', 'V', 'X', 'L', 'C' , 'D',  'M' };
    //find the index of roman number
    int index(char c){
        for(int i = 0 ; i < C.length; i++){
            if (C[i] == c)
                return i;
        }
        return -1;
    }
    //find the index of corresponding interger. 
    int rtoi(char c){
        return N[index(c)];
    }
    public int romanToInt(String s) {
    	if(s.length() <= 0) return 0;
        char[] cs = s.toCharArray();
        int sum = rtoi(cs[0]);
        for (int i = 1 ; i < cs.length; i++){
            sum += rtoi(cs[i]);
            int j = i - 1;
            int ci = index(cs[i]);
            
            while(j>=0 && index(cs[j]) < ci){
                sum -= rtoi(cs[j--]) * 2;
            }
        } 
        return sum;
    }

	public static void main(String[] args) {
		String s = "IV";
		RomanToInteger r = new RomanToInteger();
		System.out.println(r.romanToInt(s));

	}

}
