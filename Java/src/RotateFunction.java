
public class RotateFunction {
    public int maxRotateFunction(int[] A) {
    	if(A == null || A.length == 0) return 0;
    	int n = A.length;
        int[] B = new int[n];
        int res = Integer.MIN_VALUE;
        int sum = 0;
    	for(int i = 0; i < n; i++){
    		sum = sum + A[i];
    		B[0]= B[0] + i*A[i]; 
    	}
    	res = Math.max(B[0], res);
    	System.out.println(B[0]);
    	for(int i = 1; i < n; i++){
    		B[i] = B[i-1] - sum + n*A[i-1];
    		res = Math.max(B[i], res);
    		System.out.println(B[i]);
    	}
    	return res;
    }
    public static void main(String[] args){
    	int[] A = {1000000007};
    	RotateFunction r = new RotateFunction();
    	System.out.println(r.maxRotateFunction(A));
    }
}
