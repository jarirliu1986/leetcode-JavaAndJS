//Wrong answer
var getRow = function(rowIndex) {
    if(rowIndex < 0) return [];
    var num = [[1]];
    for(var i=1; i<rowIndex+1; i++){
        var row = [];
        row[0] = 1;
        row[i] = 1;
        for(var j=1; j<i; j++){
            row[j] = num[i-1][j-1] + num[i-1][j];
        }
        num.push(row);
    }
    return num[rowIndex];
};
console.log(getRow(0));