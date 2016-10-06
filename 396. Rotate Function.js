/**
 * @param {number[]} A
 * @return {number}
 */
var maxRotateFunction = function(A) {
    var ans
        , sum = 0
        , tmp = 0
        , len = A.length;

    A.forEach(function(item, index) {
        sum += item;
        tmp += index * item;
    });

    ans = tmp;

    while (A.length) {
        var last = A.pop();
        tmp = tmp + sum - last * len;
        ans = Math.max(ans, tmp);
    }

    return ans;
};
// var maxRotateFunction = function(A) {
//     var max = 0;
//     for(var i = 0; i < A.length; i++){
//         var sum = 0;
//         for(var j = i; j < i+A.length; j++){
//             sum += A[j%A.length] * (j-i);
//         }
//         max = Math.max(max, sum);
//     }
//     return max;
// };
