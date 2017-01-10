
public class AndTwoNumbers {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carrier = 0;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
        	int sum = l1.val + l2.val + carrier;
        	carrier = sum/10;
        	temp.next = new ListNode(sum%10);
        	temp = temp.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        while(l1 != null){
        	int sum = l1.val + carrier;
        	carrier = sum/10;
        	temp.next = new ListNode(sum%10);
        	temp = temp.next;
        	l1 = l1.next;
        }
        while(l2 != null){
        	int sum = l2.val + carrier;
        	carrier = sum/10;
        	temp.next = new ListNode(sum%10);
        	temp = temp.next;
        	l2 = l2.next;
        }
        if(carrier != 0){
        	temp.next = new ListNode(carrier);
        }
        return head.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
