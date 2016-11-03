/**
 * Created by Jarir on 2016.11.2.
 */
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    if(s === null || s.length ===0){
        return 0;
    }

    var hash = {};
    var num = 0;
    for(var i=0; i < s.length; i++){
        var obj = hash[s.charAt(i)];
        if(obj === undefined || obj === true){
            hash[s.charAt(i)] = false;
        }else{
            hash[s.charAt(i)] = true;
            num = num+2;
        }
    }
    if (num < s.length){
        num++;
    }
    return num;
};

var s = "abccccdd";
console.log(longestPalindrome(s));