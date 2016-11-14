/**
 * Created by Jarir on 2016.10.10.
 */
/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    if(n <= 0) return "";

    var cur = "1";
    var count = 1;

    while(n > 1){
        var res = "";
        for(var i=0; i < cur.length; i++){
            if(i < cur.length-1 && cur.charAt(i) === cur.charAt(i+1)){
                count++;
            }else{
                res += count + "" + cur[i];
                count = 1;
            }
        }
        cur = res;
        n--;
    }
    return res;
};
