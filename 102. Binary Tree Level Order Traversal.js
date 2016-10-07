/**
 * Created by Jarir on 2016.10.6.
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
var levelOrder = function(root) {
    var result = [];
    if(root === null){
        return result;
    }

    var curCnt = 1;
    var nextCnt = 0;
    var temp = [];
    var queue = [];
    queue.push(root);

    while (curCnt !== 0){
        var node = queue.shift();
        curCnt --;
        temp.push(node.val);

        if(node.left){
            queue.push(node.left);
            nextCnt++;
        }
        if(node.right){
            queue.push(node.right);
            nextCnt++;
        }

        if (curCnt === 0){
            result.push(temp);
            temp = [];
            curCnt = nextCnt;
            nextCnt = 0;
        }
    }
    return result;
};
