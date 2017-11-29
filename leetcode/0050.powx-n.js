/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    let result = 1;
    for(let i = 0; i < Math.abs(n); i ++) {
        result *= x;
    }
    return n < 0 ? 1 / result : result
};

/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    let result = 1;
    let positiveN = Math.abs(n);
    if (positiveN !== 0) {
        result = calcPowRecursive(x, positiveN);
    }
    function calcPowRecursive(x, n) {
        if (n > 1) {
            let halfPowN = Math.round(n / 2);
            let halfPow = calcPowRecursive(x, halfPowN);
             return halfPow * halfPow / (Math.round(n / 2) === n / 2 ? 1 : x);
        }
        return x;
    }

    return n < 0 ? 1 / result : result
};