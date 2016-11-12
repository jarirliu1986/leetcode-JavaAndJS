

public class SingleNumber {
	   public int singleNumber(int[] A) {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
	        if (A.length == 1) return A[0];
	        int s = A[0];
	        
	        for(int i = 1; i< A.length; i++)
	            s ^= A[i];
	            
	        return s;
	        
	    }
	   public static void main(String[] args){
		   SingleNumber s = new SingleNumber();
		   int[] A = {1,1,2,4,6,4,2};
		   System.out.println(s.singleNumber(A));
	   }
}
