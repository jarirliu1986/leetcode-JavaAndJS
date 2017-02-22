import java.util.*;
public class MissingNumber {
	
    public static int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int index = 0;
        while(index < nums.length){
        	if(nums[index] == index){
        		index++;
        	}else 
        		return index;
        }
        return index;
    }

	public static void main(String[] args) {
		int[] array = {1,0};
		System.out.println(missingNumber(array));

	}

}
