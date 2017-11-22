/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let i = 0;
    while ((i + 1) * (i + 1) <= x) {
        i ++
    }
    return i;
};

