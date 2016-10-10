/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    var obj = {};
    for(var i=0; i < nums.length; i++){
        if(obj[nums[i]] === undefined){
            obj[nums[i]] = i;
        }else{
            return true;
        }
    }
    return false;
};
