/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n <= 0) return 0;
    if(n === 1) return 1;

    var res = [];
    res[0] = 0;
    res[1] = 1;
    res[2] = 2;

    for(var i = 3; i <= n; i++){
        res[i] = res[i-1] + res[i-2];
    }
    return res[n];
};