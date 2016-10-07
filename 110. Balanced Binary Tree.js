/**
 * Created by Jarir on 2016.10.5.
 */
/**
 * Given a binary tree, determine if it is height-balanced.
 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the
 two subtrees of every node never differ by more than 1.
 */
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
    return maxDepth(root) !== -1;
};
function maxDepth(root) {
    if(root === null){
        return 0;
    }
    var right = maxDepth(root.right);
    var left = maxDepth(root.left);
    if(right === -1 || left === -1 || Math.abs(right-left)>1){
        return -1;
    }

    return Math.max(right, left)+1;
}