
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }

    public boolean helper(TreeNode root, long start, long end){
    	if(root == null) return true;
    	if(root.val <= start || root.val >= end)
    		return false;
    	
    	return helper(root.right, root.val, end) && helper(root.left, start, root.val);
    }
    
}
