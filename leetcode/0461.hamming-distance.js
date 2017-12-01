/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
    let s1 = (x >>> 0).toString(2).split('').reverse();
    let s2 = (y >>> 0).toString(2).split('').reverse();
    let result = 0;
    let i = 0;
    while (s1[i] !== undefined || s2[i] !== undefined) {
        result += (s1[i] | 0) !== (s2[i] | 0) ? 1 : 0;
        i++;
    }
    return result;
};

/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
    let result = ((x) ^ (y)).toString(2);
    return result > 0 ? result.match(/1/g).length : 0;
};