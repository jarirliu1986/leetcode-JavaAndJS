/**
 * Created by Jarir on 2016.11.2.
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
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    var max = Math.max(p.val, q.val);
    var min = Math.min(p.val, q.val);
    while(root !== null){
        var val = root.val;
        if(val <= max && val >= min){
            return root;
        }else if(val < min){
            root = root.right;
        }else{
            root = root.left;
        }
    }
    return root;
};
