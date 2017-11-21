/**
 * @param {number} n
 * @return {number}
 */
let count = 0;
var climbStairs = function(n) {
    countRecurcive(n);
    return count;
};
function countRecurcive (left) {
    if (left === 0) count ++;
    if (left < 0) return;
    countRecurcive(--left);
    countRecurcive(--left);
}

/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let result = [1, 2];
    for (let i = 2; i < n; i ++) {
        result.push(result[i - 2] + result[i - 1]);
    }
    return result[n - 1];
};
