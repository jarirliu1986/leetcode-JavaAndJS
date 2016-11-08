/**
 * Created by Jarir on 2016.11.7.
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if(head === null || head.next === null){
        return head;
    }
    var pre = head, cur = head.next;
    while(cur !== null){
        if(pre.val === cur.val){
            pre.next = cur.next;
        }else{
            pre = cur;
        }
        cur = cur.next;
    }
    return head;
};