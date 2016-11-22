import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    	if(nums == null || nums.length < 3) return null;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0; i<nums.length; i++){
        	if(i>0 && nums[i] == nums[i-1]) continue;
        	
        	int post = i+1;
        	int last = nums.length-1;
        	while(post < last){
        		if(nums[post]+nums[last]+nums[i] > 0){
        			last--;
        		}else if(nums[post]+nums[last]+nums[i] < 0){
        			post++;
        		}else{
        			List<Integer> alist = new ArrayList<Integer>();
                	alist.add(nums[i]);
                	alist.add(nums[post]);
                	alist.add(nums[last]);
                	list.add(alist);
                	while(post < last && nums[post] == nums[post+1]){
                		post++;
                	}
                	while(post < last && nums[last] == nums[last-1]){
                		last--;
                	}
                	post = post + 1;
    				last = last - 1;
        		}
        	}
        	
        }
        return list;
    }
}
