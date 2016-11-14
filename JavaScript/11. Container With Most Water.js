/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    	var s = 0;
    	var e = height.length-1;
    	var max = 0;
    	while(s < e) {
    		var container = Math.min(height[s], height[e])*(e-s);
    		max = Math.max(container, max);
    		if (height[s] <= height[e]) {
    			s++;
    		}else{
    			e--;
    		}
    	}
    	return max;
	};