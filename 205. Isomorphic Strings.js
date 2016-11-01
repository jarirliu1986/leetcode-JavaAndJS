/**
 * Created by Jarir on 2016.10.31.
 */
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    if(s === null || t === null || s.length !== t.length){
        return false;
    }
    var hash1 = {};
    var hash2 = {};
    for(var i=0; i<s.length; i++){
        var tmp = s.charAt(i);
        var tmp2 = t.charAt(i);
        if(hash1[tmp] === undefined){
            hash1[tmp] = tmp2;
        }else if(hash1[tmp] !== tmp2){
            return false;
        }
        if(hash2[tmp2] === undefined){
            hash2[tmp2] = tmp;
        }else if(hash2[tmp2] !== tmp){
            return false;
        }
    }
    return true;
};
console.log(isIsomorphic("aa", "ab"));
