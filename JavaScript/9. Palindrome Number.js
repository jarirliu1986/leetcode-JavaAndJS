/**
 * Created by Jarir on 2016.11.4.
 */
/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    x = x.toString();
    if(x===null) return false;
    var length = x.length;
    var len = Math.floor(length);
    for(var i=0; i<=len; i++){
        if(x.charAt(i) !== x.charAt(length-i-1)){
            return false;
        }
    }
    return true;
};
var a = 123321;
console.log(isPalindrome(a));