/**
 * Created by Jarir on 2016.10.5.
 */
/**
 Given two binary strings, return their sum (also a binary string).
 For example,
     a = "11"
 b = "1"
 Return "100".
 */
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    var str = "";
    var i = a.length-1, j = b.length-1, flag = 0;
    while(i >= 0 || j >= 0 || flag !== 0 ){
        var aChar = 0, bChar = 0;
        if(i >= 0){
            aChar = parseInt(a.charAt(i));
            i--;
        }
        if(j >= 0){
            bChar = parseInt(b.charAt(j));
            j--;
        }
        var res = aChar + bChar + flag;
        str = String(res%2) + str;
        flag = Math.floor(res/2);
        console.log(flag);
    }
    return str;
};
