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
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    var res = [];
    if(root === null){
        return res;
    }
    helper(root,[], res);
    return res;
};

function helper(node, temp, res) {
    if(node !== null){
        temp.push(node.val);
        if (node.left === null && node.right === null){
            res.push(temp.join('->'));
        }
        helper(node.left, temp, res);
        helper(node.right, temp, res);
        temp.pop();
    }
}
