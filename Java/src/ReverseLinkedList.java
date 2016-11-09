
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while(cur != null){
        	//pre.next = cur.next;
        	head.next = cur.next;
        	cur.next = pre;
        	ListNode temp = cur;
        	cur = head.next;
        	pre = temp;
        }
    	return pre;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
