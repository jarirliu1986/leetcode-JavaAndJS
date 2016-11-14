/**
 * Created by Jarir on 2016.11.4.
 */
/**
 * @param {number} n
 * @return {number}
 */
var findNthDigit = function(n) {
    return dfs(1, n);

    function dfs(digits, left) {
        var start = Math.pow(10, digits - 1);
        var last = Math.pow(10, digits) - 1;
        var len = last - start + 1;
        var num = len * digits;

        if (num < left)
            return dfs(digits + 1, left - num);
        else {
            var remainder = left % digits ? left % digits : digits;
            var rightNumber = Math.ceil(left / digits) - 1 + start;

            return +String(rightNumber)[remainder - 1];
        }
    }
};