
public class ConstructTreePreIn {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
	    return helper(preorder, inorder, 0, 0, inorder.length-1);
	}
	public TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
		if(inEnd < inStart || preStart > preorder.length-1){
			return null;
		}
		int inIndex=0;
		for(int i=0; i <= inEnd; i++){
			if(inorder[i] == preorder[preStart]){
				inIndex = i;
				break;
			}
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		root.left = helper(preorder, inorder, preStart+1, inStart, inIndex-1);
		root.right = helper(preorder, inorder, preStart+inIndex-inStart+1, inIndex+1, inEnd);
		
		return root;
	}
}
