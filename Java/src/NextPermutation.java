import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 2) return;
        
        int len = nums.length;
        int index = len-1;
        while(index > 0){
        	if(nums[index-1] < nums[index]){
        		break;
        	}
        	index--;
        }
        
        if(index == 0) {
        	Arrays.sort(nums);
        	return;
        }else{
        	int j = len-1;
        	while(j>=index){
        		if(nums[j] > nums[index-1]){
        			break;
        		}
        		j--;
        	}
        	swap(nums, j, index-1);
        	Arrays.sort(nums, index, len);
        }
        
        
    }
    
    public void swap(int[] nums, int i, int j){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
//    public static void reverseSort(int[] nums, int start, int end){
//    	if(start > end) return;
//    	Arrays.sort(nums, start, end);
//    }
    
    public static void main(String[] args){
    	int[] nums = {1,3,2};
    	NextPermutation s = new NextPermutation();
    	s.nextPermutation(nums);
    	for(int i : nums){
    		System.out.println(i);
    	}
    	
    }
}
