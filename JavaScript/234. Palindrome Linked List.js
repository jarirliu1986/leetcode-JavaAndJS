/**
 * Created by Jarir on 2016.11.4.
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
var isPalindrome = function(head) {
    var arr = [];
    while(head){
        arr.push(head.val);
        head = head.next;
    }
    var len = arr.length;
    var mid = Math.floor((len-1)/2);

    for(var i = 0; i <= mid; i++){
        if(arr[i] !== arr[len-1-i]){
            return false;
        }
    }
    return true;
};

