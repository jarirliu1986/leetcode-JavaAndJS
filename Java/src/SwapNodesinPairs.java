
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
        ListNode pre = head;
        ListNode post = head.next;
        while(post != null){
        	int val = pre.val;
        	pre.val = post.val;
        	post.val = val;
        	
        	pre = post.next;
        	post = pre==null? null : pre.next;
        }
    	return head;
    }
}
