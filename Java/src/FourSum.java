import java.util.*;

public class FourSum {
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Set<List<Integer>> filter = new HashSet<List<Integer>>();
    	
    	if(nums==null||nums.length<4) return list;
    	
    	int len = nums.length;
    	Arrays.sort(nums);
    	for(int i=0; i<len; i++){
    		for(int j=i+1; j<len; j++){	
    			int post = j+1;
    			int last = len-1;
    			while(post<last){
    				int sum = nums[post]+nums[last]+nums[i] + nums[j];
    				if(sum == target){
    					List<Integer> alist = new ArrayList<Integer>();
                		alist.add(nums[i]);
            			alist.add(nums[j]);
            			alist.add(nums[post]);
            			alist.add(nums[last]);
            			filter.add(alist);
            			post = post + 1;
        				last = last - 1;
    				}else if(sum > target){
            			last--;
            		}else{
            			post++;
            		}
    			}
    		}	
    	}	
    	
        for(List<Integer> tmp:filter){
        	list.add(tmp);
        }
    	return list;
    }

	public static void main(String[] args) {
		FourSum sum = new FourSum();
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		System.out.println(sum.fourSum(nums, 0));
	}

}
