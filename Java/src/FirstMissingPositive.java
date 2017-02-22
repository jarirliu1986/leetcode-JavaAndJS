import java.util.*;

public class FirstMissingPositive {
	
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
        	if(nums[i]>0){
        		set.add(nums[i]);
        	}
        }
        if(set == null || set.size() == 0) return 1;
        int j=1;
        while(true){
            if(set.contains(j)) j++;
            else return j;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
