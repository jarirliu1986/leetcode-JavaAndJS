/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    if(n <= 0) return false;
    while(n !== 1){
        if(!n%3){
            return false;
        }
        n = n/3;
    }
    return true;
};