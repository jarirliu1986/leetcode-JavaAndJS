/**
 * Created by Jarir on 2016.11.3.
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    var n = 0;
    var index = nums.findIndex(function (num) {
        return num === 0;
    });
    while(index > -1){
        nums.splice(index, 1);
        index = nums.findIndex(function (num) {
            return num === 0;
        });
        n = n+1;
    }
    var len = nums.length;
    for(var i=0; i < n; i++){
        nums[len+i]=0;
    }
};
var a = [0,2,3,0,0,4,5,1,0,2];
console.log(a);
moveZeroes(a);
console.log(a);
