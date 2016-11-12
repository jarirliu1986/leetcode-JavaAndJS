import java.util.LinkedList;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null){
    		return true;
    	}
    	
        LinkedList<TreeNode> dqueue = new LinkedList<TreeNode>();
        dqueue.add(root.left);
        dqueue.add(root.right);
        
        TreeNode pre = null;
        TreeNode post = null;
        
        while(!dqueue.isEmpty()){
        	pre = dqueue.pollFirst();
        	post = dqueue.pollLast();
        	
        	if(pre == null && post == null){
        		continue;
        	}
        	if(pre == null || post == null){
        		return false;
        	}
        	if(pre.val != post.val){
        		return false;
        	}else{
        		dqueue.addFirst(pre.right);
        		dqueue.addFirst(pre.left);
        		dqueue.addFirst(post.left);
        		dqueue.addFirst(post.right);
        	}	
        }
    	return true;
    }
}
