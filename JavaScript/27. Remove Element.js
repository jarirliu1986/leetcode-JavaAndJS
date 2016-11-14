/**
 * Created by Jarir on 2016.11.7.
 */
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    if(nums === null || nums.length===0){
        return 0;
    }
    var res = nums.length;
    var temp=nums.indexOf(val);
    while( temp>= 0){
        nums.splice(temp, 1);
        res = res-1;
        temp=nums.indexOf(val)
    }
    return res;
};