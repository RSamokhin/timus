/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    let bin = (num >>> 0).toString(2);
    console.log(bin)
    return [].reduce.call(bin, (a, b, i) => a + ((b === '0') ? Math.pow(2, bin.length - i - 1) : 0), 0);
};

/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    let len = (num >>> 0).toString(2).length;
    return (~num << (32 - len) >>> (32 - len));
};