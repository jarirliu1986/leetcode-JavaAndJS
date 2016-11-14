/**
 * Created by Jarir on 2016.10.9.
 */
/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    var a = secret.split('');
    var b = guess.split('');
    var len = a.length;
    var aNum = 0, bNum = 0;

    for (var i=len-1; i >= 0; i--){
        if(a[i] === b[i]){
            aNum++;
            a.splice(i,1);
            b.splice(i,1);
        }
    }

    for(i=0; i < b.length; i++){
        var index = a.indexOf(b[i]);
        if(index > -1){
            bNum++;
            a.splice(index, 1);
        }
    }
    return aNum+'A'+bNum+'B';
};


