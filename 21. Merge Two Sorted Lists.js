/**
 * Created by Jarir on 2016.11.2.
 */

  //Definition for singly-linked list.
  function ListNode(val) {
      this.val = val;
      this.next = null;
  }

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    if(l1 === null ){
        return l2;
    }
    if(l2 === null){
        return l1;
    }
    var head = new ListNode(-1);
    head.next = l1;
    var p = head;
    while(l1 !== null && l2 !== null){
        if(l1.val <= l2.val){
            p = p.next;
            l1 = l1.next;
        }else{
            var temp = l2.next;
            l2.next = l1;
            p.next = l2;
            l2 = temp;
            p = p.next;
        }
        if(l1===null) p.next=l2;
    }
    return head.next;
};
