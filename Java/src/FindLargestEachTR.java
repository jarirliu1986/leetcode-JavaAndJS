import java.util.*;

public class FindLargestEachTR {
    public List<Integer> largestValues(TreeNode root) {
    	List<Integer> list = new LinkedList<Integer>();
    	if(root == null) return list;
    	
    	Queue<TreeNode> q = new LinkedList<>();
    	q.add(root);
    	int cur = 1, next = 0, max = Integer.MIN_VALUE;
    	
    	while(q.peek() != null){  		
    		TreeNode curNode = q.poll();
    		cur--;
    		max = Math.max(max, curNode.val);
    		if (curNode.left != null) {
				q.add(curNode.left);
				next++;
			}
    		if(curNode.right != null){
    			q.add(curNode.right);
    			next++;
    		}		
    		if(cur == 0){
    			list.add(max);
    			max = Integer.MIN_VALUE;
    			cur = next;
    			next = 0;
    		}   		
    	}    	
    	return list;
    }
}
