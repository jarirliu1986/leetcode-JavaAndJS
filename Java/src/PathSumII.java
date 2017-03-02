import java.util.*;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> list = new LinkedList<>();
        List<Integer> alist = new LinkedList<Integer>();
        helper(list, alist, root, sum);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> alist, TreeNode root, int sum){
    	if(root == null) return;
    	
    	alist.add(root.val);
    	if(root.left == null && root.right == null && root.val == sum){
    		list .add(new LinkedList<Integer>(alist));
    		alist.remove(alist.size()-1);
    		return;
    	}
    	
    	helper(list, alist, root.left, sum-root.val);
    	helper(list, alist, root.right, sum-root.val);
    	alist.remove(alist.size()-1);
    }
}
