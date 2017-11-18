/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000};
    return s.split('').reduceRight((a, b, i, array) => a + (dict[b] < dict[array[i + 1]] | 0 ? -dict[b] : dict[b]), 0)
};