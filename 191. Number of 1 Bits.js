/**
 * Created by Jarir on 2016.11.4.
 */
/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
    var num = 0;
    while(n >= 2){
        if(n%2) {
            num++;
        }
        n = Math.floor(n/2);
    }
    if(n === 1) num = num+1;
    return num;
};
console.log(hammingWeight(11));