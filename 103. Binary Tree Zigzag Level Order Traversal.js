/**
 * Created by Jarir on 2016.10.9.
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
 * @return {number[][]}
 */
var zigzagLevelOrder = function(root) {
    var result = [];
    if(root === null){
        return result;
    }

    var temp = [];
    var queue = [];
    queue.push(root);
    var curCount = 1;
    var nextCount = 0;
    var flag = true;

    while(curCount !== 0){
        var node = queue.shift();
        if(flag){
            temp.push(node.val);
        }else{
            temp.unshift(node.val);
        }
        curCount--;

        if(node.left){
            queue.push(node.left);
            nextCount++;
        }
        if(node.right){
            queue.push(node.right);
            nextCount++;
        }

        if(curCount === 0){
            result.push(temp);
            temp = [];
            curCount = nextCount;
            nextCount = 0;
            flag = !flag;
        }
    }
    return result;
};
