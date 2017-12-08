/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
    let l = 0, r = s.length - 1;
    let result = s.split('');
    while (l < r) {
        let tmp = result[l];
        result[l++] = result[r];
        result[r--] = tmp;
    }
    return result.join('');
};