/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * Definition for a binary tree node.
 */
 function TreeNode(val) {
     this.val = val;
     this.left = this.right = null;
 }
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {boolean}
 */
var hasPathSum = function(root, sum) {
    if(root === null)return false;
    return helper(root, sum, 0);
};

function helper(root, sum, num) {
    if(root === null){
        return false;
    }
    num = root.val + num;
    if(root.right === null && root.left === null){
        return sum === num;
    }

    return helper(root.right, sum, num) || helper(root.left, sum, num);
}