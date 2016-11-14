/**
 * Created by Jarir on 2016.10.31.
 */
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    var num = 0;
    if(s === null || s.length === 0){
        return num;
    }

    s = s.trim();
    var len = s.length;
    while(len > 0 && s.charAt(len-1) !== " "){
        num = num+1;
        len--;
    }
    return num;
};

