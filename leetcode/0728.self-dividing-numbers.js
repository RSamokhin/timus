/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function(left, right) {
    let result = [];
    for (let i = left; i <= right; i++) {
        let didgits = i.toString().split('').map(d => parseInt(d));
        if (didgits.includes(0)) {
            continue;
        }
        if (didgits.every(d => i / d === Math.round(i / d))) {
            result.push(i);
        }
    }
    return result;
};