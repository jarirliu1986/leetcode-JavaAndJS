
public class PathSumI {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum)
        	return true;
        boolean left = (root.left == null) ? false : hasPathSum(root.left, sum-root.val);
        boolean right = (root.right == null) ? false : hasPathSum(root.right, sum-root.val);
        return left || right;
    }
}
