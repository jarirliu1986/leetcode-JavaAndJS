/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {string} s
 * @return {number}
 */
var titleToNumber = function(s) {
    var map = {};
    for(var i=1; i <= 26; i++){
        map[String.fromCharCode(64+i)] = i;
    }
    //console.log(map);
    var res = 0;
    for(i=0; i<s.length; i++){
        res = res*26 + map[s.charAt(i)];
    }
    return res;
};
console.log(titleToNumber('Z'));
