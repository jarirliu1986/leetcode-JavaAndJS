/**
 * Created by Jarir on 2016.11.1.
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
 * @return {boolean}
 */
var hasCycle = function(head) {
    if(head == null || head.next == null){
        return false;
    }
    var node = head;
    while(node != null ){
        if(node.flag){
            return true;
        }

        node.flag = true;
        node = node.next;
    }
    return false;
};
