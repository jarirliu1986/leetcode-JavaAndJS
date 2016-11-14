/**
 * Created by Jarir on 2016.11.3.
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
 * @return {number}
 */
var minDepth = function(root) {
    if(!root){
        return 0;
    }
    var r = minDepth(root.right);
    var l = minDepth(root.left);
    if(root.left===null && root.right === null)return 1;
    else if(!root.left){
        return r+1;
    }else if (!root.right){
        return l+1;
    }else{
        return Math.min(r,l)+1;
    }
};
