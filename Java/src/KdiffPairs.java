import java.util.*;
public class KdiffPairs {
	
    public static int findPairs(int[] nums, int k) {
        if(nums == null && nums.length <= 1 && k<0) return 0;
        
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num+k, num);
        }
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.remove(num);
                count++;
            }
        }
        return count;
    }
    public static int findPairsI(int[] nums, int k) {
        if(nums == null && nums.length <= 1 && k<0) return 0;
        
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length-1; i++){
            int s=i+1, e=nums.length-1;
            while(s <= e){
            	int  mid=s+(e-s)/2;
                int dif = nums[mid] - nums[i];
                if(dif < k){
                    s = mid+1;
                }else if(dif > k){
                    e = mid-1;
                }else{
                    if(!map.containsKey(nums[i])){
                        map.put(nums[i], nums[mid]);
                    }
                    break;
                }
            }
        }
        return map.size();
    }
    public static void main(String[] args) {
	    int[] n = {3,1,4,1,5};
	    int k= 2;
	    System.out.print(findPairs(n, k));
    }
}
