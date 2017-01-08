/**
 * Created by Zheyu on 2017.1.7.
 */
function Point(x, y) {
    this.x = x;
    this.y = y;
}
/**
 * @param points is an Array of Point
 * @return Set(): a set of line expression
 * For example:
 * input: points = [[0,0], [1,1], [3,5], [2,2]]
 * output: res = Set {'y=1*x+0'}
 */
/**
 * 1 brute force method: O(n3)
 * 2 (my choice) use Map to reduce complexity: O(n2)
 */
function setsOnALine(points) {
    var res = new Set();
    var len = points.length;
    var duplex = 0;
    for(var i=0; i < len; i++){
        var mapSlope = new Map();
        for(var j=i+1; j < len; j++){
            var m, count, line, b;
            if(points[i].x === points[j].x && points[i].y === points[j].y){
                duplex++;
            }else {
                if(points[i].x === points[j].x){
                    line = 'y=' + points[i].x;
                }else{
                    m = (points[i].y - points[j].y) / (points[i].x - points[j].x);
                    b = points[i].y - m*points[i].x;
                    line = 'y=' + m + '*x+' + b;
                }
                count = mapSlope.get(line) || 1;
                mapSlope.set(line, count+1);
            }
        }
        if(duplex > 0){
            mapSlope.forEach(function (count, line) {
                mapSlope.set(line, count + duplex);
            });
        }
        mapSlope.forEach(function (count, line) {
            if(count > 2){
                res.add(line);
            }
        });
        mapSlope.clear();
    }
    return res;
}