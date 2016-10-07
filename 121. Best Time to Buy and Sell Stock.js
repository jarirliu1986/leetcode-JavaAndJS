/**
 * Created by Jarir on 2016.10.5.
 */
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var min = Number.MAX_VALUE, profit = 0;
    for(var i = 0; i < prices.length; i++){
        min = min>prices[i]? prices[i] : min;
        profit = prices[i]-min>profit? prices[i]-min : profit;
    }
    return profit;
};
