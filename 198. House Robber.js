/**
 * Created by Jarir on 2016.10.11.
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    var n = nums.length;
    if(n <= 0) return 0;
    if(n === 1) return nums[0];
    var res = [];
    res[0] = 0;
    res[1] = nums[0];
    for(var i=2; i <= n; i++){
        res[i] = Math.max(res[i-1], res[i-2]+nums[i-1]);
    }
    return res[n];
};
