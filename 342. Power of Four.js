/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * @param {number} num
 * @return {boolean}
 */
var isPowerOfFour = function(num) {
    if(num < 0) return false;
    //if(num === 1) return true;
    while(num !== 1){
        if(!num%4){
            return false;
        }
        num = num/4;
    }
    return true;
};
