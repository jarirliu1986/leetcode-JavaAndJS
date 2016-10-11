/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {number} n
 * @return {string}
 */
var convertToTitle = function(n) {
    var map = [];
    map[0] = 'Z';
    for(var i = 1; i < 26; i++){
        map[i] = String.fromCharCode(64+i);
    }

    var res = "";
    var l, h;
    while(n > 0){
        l = n%26;
        h = Math.floor(n/26);
        res = map[l]+res;
        n = l===0? h-1:h;
    }
    return res;
};
console.log(convertToTitle(26));