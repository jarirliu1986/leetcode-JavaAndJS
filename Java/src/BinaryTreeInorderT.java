import java.util.*;

public class BinaryTreeInorderT {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		helper(list, root);
		return list;
	}
	
	public void helper(ArrayList<Integer> list, TreeNode root){
		if(root != null){
			helper(list, root.left);
			list.add(root.val);
			helper(list, root.right);
		}
	}
}
