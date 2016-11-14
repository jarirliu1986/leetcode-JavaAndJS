/**
 * Created by Jarir on 2016.11.6.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number}
 */

var pathSum = function(root, sum) {
    var n = [0];
    if(root === null) return 0;
    helper(root, sum-root.val,true, n);
    return n[0];
};
function helper(root, sum, flag, n) {
    if(root.val === sum) n[0]=n[0]+1;
    var l = root.left, r = root.right, val = root.val;
    if(l!== null){
        helper(l, sum-val, false, n);
        if(flag){
            helper(l, sum, true, 0);
        }
    }
    if(r!== null){
        helper(r, sum-val, false, n);
        if(flag){
            helper(r, sum, true, 0);
        }
    }
}