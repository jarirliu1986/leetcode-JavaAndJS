/**
 * Created by Jarir on 2016.10.11.
 */
/**
 * Definition for isBadVersion()
 *
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        var s = 1, e = n, res = n;
        var mid;
        while(s <= e){
            mid = Math.floor((s+e)/2);
            if(isBadVersion(mid)){
                res = mid;
                e = mid-1;
            }else {
                s = mid+1;
            }
        }
        return res;
    };
};
