/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0;
    for (let b = 0; b < prices.length - 1; b ++) {
        for (let s = b + 1; s < prices.length; s++) {
            maxProfit = Math.max(maxProfit, prices[s] - prices[b]);
        }
    }
    return maxProfit
};

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minPrice = Number.MAX_SAFE_INTEGER;
    let maxProfit = 0;
    prices.forEach(p => {
        if (p < minPrice) {
           minPrice = p;
        } else {
            maxProfit = Math.max(p - minPrice, maxProfit);
        }

    });
    return maxProfit
};