
public class Powxn {
	//you may change the parameter int n to Long n to solve the corner problem
	
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        return n%2 == 0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }

	public static void main(String[] args) {
		System.out.println(myPow(2,3));
		
	}

}
