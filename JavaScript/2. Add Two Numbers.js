/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    if(l1 === null || l2 === null){
        return l1 || l2;
    }
    var p = l1;
    var q = l2;
    var l3 = new ListNode(0);
    var flag = 0;
    var res = l3;
    while(p || q || flag){
        var pVal = 0;
        var qVal = 0;
        if(p){
            pVal = p.val;
            p = p.next;
        }
        if(q){
            qVal = q.val;
            q = q.next;
        }
        var sum = qVal+pVal+flag;
        l3.next = new ListNode(sum%10);
        flag = Math.floor (sum/10);
        l3 = l3.next;
    }
    return res.next;
};