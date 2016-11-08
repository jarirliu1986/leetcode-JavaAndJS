/**
 * Created by Jarir on 2016.11.7.
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums === null || nums.length===0){
        return 0;
    }
    var res = 1;
    var i = 0;
    for(var j=1; j < nums.length; j++){
        if(nums[i]!==nums[j]){
            nums[++i] = nums[j];
            res++;
        }
    }
    return res;
};
var a = [1,1,2,3];
console.log(removeDuplicates(a));