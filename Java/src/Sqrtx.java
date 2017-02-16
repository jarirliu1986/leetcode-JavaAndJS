
public class Sqrtx {
	
    public int mySqrt(int x) {
        long l = x;
        while(l*l > x){
            l = (l + x/l)/2;
        }
        return (int)l;
    }

	public static void main(String[] args) {

	}

}
