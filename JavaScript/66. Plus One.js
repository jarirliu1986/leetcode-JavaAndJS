/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    var carrier = 1;
    for(var i = digits.length-1; i>=0; i--){
        var temp = digits[i]+carrier;
        digits[i] = temp % 10;
        carrier = temp>=10 ? 1:0;
    }
    if(carrier){
        digits.unshift(carrier);
    }
    return digits;
};
var a = [9,9,9];
console.log(plusOne(a));