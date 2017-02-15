import java.util.*;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
    	if(nums == null || nums.length == 0) return null;
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> alist, int[] nums){
        if(alist.size() == nums.length){
            list.add(new ArrayList<Integer>(alist));
        }else{
            for(int i=0; i<nums.length; i++){
            	int num = nums[i];
            	if(alist.contains(num)) continue;
            	alist.add(num);
            	backtrack(list, alist, nums);
            	alist.remove(alist.size()-1);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asce";
		System.out.print(s.contains("ase"));

	}

}
