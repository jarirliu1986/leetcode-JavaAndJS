/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    var count = 0;
    for(var i=1; i < n; i++){
        if(isPrime(i)){
            count++;
        }
    }
    return count;
};
function isPrime(num) {
    if (num <= 1) return false;
    for(var i=2; i*i <= num; i++){
        if(num%i === 0){
            return false;
        }
    }
    return true;
}

