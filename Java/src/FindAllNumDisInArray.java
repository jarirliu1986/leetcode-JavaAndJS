import java.util.*;

public class FindAllNumDisInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        if(nums == null || nums.length==0) return list;
        Set<Integer> set = new HashSet<Integer>();
        int max = nums.length;
        
        
        for(int num : nums){
        	set.add(num);
        	//max = Math.max(num, max);
        }
      
        for(int i=1; i<=max; i++){
        	if(!set.contains(i))
        		list.add(i);
        }
        return list;
    }
    
    public static void main(String[] args){
    	int[] n = {1,1};
    	System.out.print(findDisappearedNumbers(n));
    }
}
