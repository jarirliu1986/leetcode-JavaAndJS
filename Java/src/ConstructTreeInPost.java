
public class ConstructTreeInPost {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    public TreeNode helper(int[] inorder, int[] postorder, int is, int ie, int ps, int pe){
    	if(ps > pe) return null;
    	
    	TreeNode root = new TreeNode(postorder[pe]);
    	int inIndex = 0;
    	for (int i=is; i<=ie; i++){
    		if(inorder[i] == root.val){
    			inIndex = i;
    			break;
    		}
    	}
        root.left = helper(inorder, postorder, is, inIndex-1, ps, ps+inIndex-is-1);
    	root.right = helper(inorder, postorder, inIndex+1, ie, pe+inIndex-ie, pe-1);

    	return root;
    }
}
