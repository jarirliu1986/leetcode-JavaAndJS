/**
 * Created by Jarir on 2016.10.11.
 */
/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    var obj = {};
    return helper(n, obj);
};
function helper(n, obj) {
    if(n === 1){
        return true;
    }

    var res = 0;
    while(n > 0){
        var a = (n%10);
        res += a*a;
        n = Math.floor(n/10);
        //console.log(res);
    }

    if(obj[res] !== undefined){
        return false;
    }else{
        obj[res] = true;
        return helper(res, obj);
    }
}
console.log(helper(1, {}));