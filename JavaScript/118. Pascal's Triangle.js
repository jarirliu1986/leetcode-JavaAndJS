/**
 * Created by Jarir on 2016.11.6.
 */
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if(numRows <= 0) return [];
    var num = [[1]];
    for(var i=1; i<numRows; i++){
        var row = [];
        row[0] = 1;
        row[i] = 1;
        for(var j=1; j<i; j++){
            row[j] = num[i-1][j-1] + num[i-1][j];
        }
        num.push(row);
    }
    return num;
};
