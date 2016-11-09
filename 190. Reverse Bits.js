/**
 * Created by Jarir on 2016.11.7.
 */
/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    if(n <= 0) return;
    var str = n.toString(2);
    if(str.length < 32){
        for(var len=str.length; len < 32; len++){
            str = "0" + str;
        }
    }
    console.log(str);
    var res = str.charAt(31)==="0"? 0 : 1;
    for(var a=30; a >= 0; a--){
        res = (res + parseInt(str.charAt(a)))*2;
        console.log(res + ", " + a);
    }
    return res;
};

var n = 1;
console.log(reverseBits(12));