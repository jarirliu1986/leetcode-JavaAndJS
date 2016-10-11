/**
 * Created by Jarir on 2016.10.11.
 */
/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    if(s.length != t.length-1){
        return null;
    }
    for(var i=0; i < t.length; i++){
        var ch = t.charAt(i);
        var pos = s.indexOf(ch);
        if(pos === -1){
            return ch;
        }else{
            s = s.slice(0, pos) + s.slice(pos+1, s.length);
        }
    }
};
var s = '12345';
var t = '345216';
console.log(findTheDifference(s,t));
