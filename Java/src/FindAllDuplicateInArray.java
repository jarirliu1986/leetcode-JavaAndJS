import java.util.*;

public class FindAllDuplicateInArray {
    public List<Integer> findDuplicates(int[] nums) {
    	List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length <= 1) return list;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : nums){
        	if(set.contains(num)){
        		list.add(num);
        	}else{
        		set.add(num);
        	}		
        }
        
        return list;
    }
}
