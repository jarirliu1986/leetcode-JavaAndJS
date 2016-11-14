/**
 * Created by Jarir on 2016.10.30.
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    var tmpa = headA;
    var hash = {};
    var tmpb = headB;
    while(tmpa !== null){
        hash[tmpa.val] = true;
        tmpa = tmpa.next;
    }

    while(tmpb !== null){
        if(hash[tmpb.val] !== undefined){
            return tmpb;
        }
        tmpb = tmpb.next;
    }

    return null;
};
