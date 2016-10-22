/**
 * Created by Jarir on 2016.10.12.
 */
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    var res = [];
    var obj = {};
    for(var i=0; i < nums1.length; i++){
        if(obj[nums1[i]] === undefined){
            obj[nums1[i]] = true;
        }
    }

    for(i=0; i < nums2.length; i++){
        if(obj[nums2[i]] === true){
            res.push(nums2[i]);
            obj[nums2[i]] = false;
        }
    }
    return res;
};
