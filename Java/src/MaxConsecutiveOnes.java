
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length <= 0) return 0;
        
        int max = 0, cnt = 0;
        for(int num : nums){
        	if(num == 1) {
        		cnt++;
        	}else{
        		max = Math.max(cnt, max);
        		cnt = 0;
        	}
        }
        max = Math.max(cnt, max);
        return max;
    }
}
