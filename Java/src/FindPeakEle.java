
public class FindPeakEle {
    public int findPeakElement(int[] nums) {
        return helper(0, nums.length-1, nums);
    }
    
    public int helper(int start, int end, int[] nums){
        if(start == end){
            return start;
        }else if(start+1 == end){
            return nums[start]>nums[end]? start : end;
        }else{
            int mid = (start+end)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid-1] > nums[mid] && nums[mid] > nums[mid+1]){
                return helper(start, mid-1, nums);
            }else{
                return helper(mid+1, end, nums);
            }
        }
    }
}
