
public class StringtoInteger {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() < 1)return 0;
        double result = 0;
        
        char flag = '+';
        int i = 0;
        if(str.charAt(0) == '-') {
        	flag = '-';
        	i++;
        }
        else if(str.charAt(0) == '+')
        	i++;
        
        for(; i <str.length() && str.charAt(i) <= '9' && str.charAt(i) >= '0' ; i++ )
        	result = result*10 + (str.charAt(i) - '0');
        if (flag == '-') result = -result;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int)result;
    }
}
