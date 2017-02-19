import java.util.*;

public class PermutationSequence {
	
    public String getPermutation(int n, int k) {
        //List<List<Integer>> res = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
        backtrack(n, k, list);
        return list.toString();
    }
    

	public void backtrack(int n, int k, List<Integer> list){
    	if(list.size() == n){
    		//k--;	
    		System.out.print(k);
    		System.out.println(list);
    	}
    	if(k==0) return;
    	
    	for(int i=1; i<=n; i++){
    		if(list.contains(i)) continue;
    		list.add(i);
    		backtrack(n, k, list);
    		list.remove(list.size()-1);
    	}
    }

	public static void main(String[] args) {
		PermutationSequence s = new PermutationSequence();
		System.out.println(s.getPermutation(3, 3));

	}

}
