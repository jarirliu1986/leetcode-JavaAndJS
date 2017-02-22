import java.util.*;

public class PermutationSequence60 {
	public String getPermutation(int n, int k) {
		int[] factor = new int[n];
		factor[0] = 1;
		for(int i=1; i<n; i++){
			factor[i] = i*factor[i-1];
		}
		
        StringBuilder sb = new StringBuilder();
        k = k-1;
        
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1; i<=n; i++) numbers.add(i);
        
        for(int i=n; i>0; i--){
        	int index = k/factor[i-1];
        	k = k % factor[i-1];
        	int temp = numbers.get(index);
        	sb.append(temp);
        	numbers.remove(index);
        }
        
        return sb.toString();
    }
}
