/**
 * Created by Jarir on 2016.11.2.
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort();
    return nums[Math.floor(nums.length/2)];
};
