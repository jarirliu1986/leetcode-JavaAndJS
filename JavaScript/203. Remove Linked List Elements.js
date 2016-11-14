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
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    var temp = new ListNode(-1);
    temp.next = head;
    var pre = temp;
    while(head !== null){
        if(head.val === val){
            pre.next = head.next;
        }else{
            pre = head;
        }
        head = head.next;
    }
    return temp.next;
};