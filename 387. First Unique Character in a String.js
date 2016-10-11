/**
 * Created by Jarir on 2016.10.11.
 */
/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    //if(s.length === 0) return -1;
    var map = {};
    for(var i = 0; i < s.length; i++){
        var ch = s.charAt(i);
        if(i === s.lastIndexOf(ch) && map[ch] === undefined){
            return i;
        }else{
            map[ch] = false;
        }
    }
    return -1;
};
var s = 'cccccc';
console.log(firstUniqChar(s));