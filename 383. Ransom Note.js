/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    if(ransomNote.length > magazine.length) return false;
    var hash = {};
    for(var i=0; i<magazine.length; i++){
        var index = magazine.charAt(i);
        if(hash[index] ===undefined){
            hash[index] = 1;
        }else{
            hash[index] = hash[index]+1;
        }
    }
    for(i=0; i<ransomNote.length; i++){
        index = ransomNote.charAt(i);
        if(hash[index] === undefined || hash[index] === 0){
            return false;
        }else{
            hash[index] = hash[index]-1;
        }
    }
    return true;
};

var a = "qwer";
var b = "qwrt";
console.log(canConstruct(a,b));