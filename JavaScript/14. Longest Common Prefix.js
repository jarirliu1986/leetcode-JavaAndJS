/**
 * Created by Jarir on 2016.11.1.
 */
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs === null || strs.length === 0){
        return "";
    }

    var res = "";
    var len = strs[0].length;
    for(var i=0; i < len; i++){
        var pre = strs[0].slice(0,i+1);
        if(strs.every(function (item) {
                return item.indexOf(pre)=== 0;
            })){
            res = pre;
        }else{
            return res;
        }
    }
    return res;
};

var s =["rerere", "refrr", "refrew"];
console.log(longestCommonPrefix(s));
