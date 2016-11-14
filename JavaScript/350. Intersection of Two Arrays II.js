/**
 * Created by Jarir on 2016.10.22.
 */
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    var res = [];
    var obj = {};
    for(var i=0; i < nums1.length; i++){
        if(obj[nums1[i]] === undefined){
            obj[nums1[i]] = 1;
        }else{
            obj[nums1[i]]++;
        }
    }

    for(i=0; i < nums2.length; i++){
        if(obj[nums2[i]] !== undefined && obj[nums2[i]] > 0){
            res.push(nums2[i]);
            obj[nums2[i]]--;
        }
    }

    return res;
};
