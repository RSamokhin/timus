/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    let sumsSet = new Set();
    let sum;
    while (true) {
        n = splitOnDigits(n).reduce((a, b) => a + b * b, 0);
        // console.log(n);
        if (sumsSet.has(n) || n === 1) {
            break;
        } else {
            sumsSet.add(n);
        }
    }
    return n === 1;
};

function splitOnDigits (n) {
    let digits = [];
    while (n > 0) {
        digits.push(n % 10);
        n = Math.floor(n / 10);
    }
    return digits;
}