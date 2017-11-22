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

/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let l = 0;
    let r = Math.pow(2,31);
    while (true) {
        let mid = l + Math.floor(r - l) / 2;
        if (mid > x/mid) {
            r = mid - 1;
        } else {
            if (mid + 1 > x / (mid + 1))
                return mid;
            l= mid + 1;
        }
    }
};