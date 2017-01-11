
public class AddStrings {
	
    public String addStrings(String num1, String num2) {
       String res = "";
       
       int i = num1.length()-1, j = num2.length()-1, carrier = 0;
       while(i >= 0 || j >= 0){
    	   if(i>=0){
    		   carrier += num1.charAt(i--) - '0';
    	   }
    	   if(j>=0){
    		   carrier += num2.charAt(j--) - '0';
    	   }
    	   res = carrier%10 +res;
    	   carrier /= 10;
       }
       
       return carrier==0? res : "1" + res ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		String s = "hello" + i/2;
		System.out.println(s);

	}

}
