/**
 * Created by Jarir on 2016.10.5.
 */
/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 For example:Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    if(Math.floor(num/10) === 0){
        return num;
    }
    var temp = num;
    num = 0;
    while (temp !== 0){
        num += temp%10;
        temp = Math.floor(temp/10);
    }
    return addDigits(num);
};
function helper(num) {
    if(Math.floor(num/10) === 0){
        return num;
    }
    var temp = num;
    num = 0;
    while (temp%10 !== 0){
        num += temp%10;
        temp = Math.floor(temp/10);
    }
    return helper(num);
}
console.log(addDigits(281));
console.log(helper(281));