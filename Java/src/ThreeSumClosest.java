import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
    	int result = Integer.MAX_VALUE;
    	if(nums == null || nums.length < 3) return Integer.MAX_VALUE;
        Arrays.sort(nums);
        int minDif = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
        	int s = i+1;
        	int e = nums.length-1;;
        	while(s < e){
        		int sum = nums[i]+nums[s]+nums[e];
        		int dif = Math.abs(sum-target);
        		if(dif == 0) return sum;
        		if(minDif < dif){
        			result = sum;
        			minDif = dif;
        		}
        		if(sum > target){
        			e--;
        		}else{
        			s++;
        		}
        	}
        }
    	return result;
    }
}
