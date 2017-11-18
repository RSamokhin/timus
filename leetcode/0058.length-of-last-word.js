/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let result = 0;
    let i = s.length - 1;
    while (i >= 0) {
        if (!result && s[i] === ' '){i--; continue};
        if (result && s[i] === ' ') {break};
        result ++;i --;
    }
    return result
};