/**
 * Created by Jarir on 2016.10.7.
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
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    var res = [];
    helper(root, res);
};

function helper(root, res) {
    if(root !== null){
        helper(root.left, res);
        res.push(root.val);
        helper(root.right, res);
    }
}
