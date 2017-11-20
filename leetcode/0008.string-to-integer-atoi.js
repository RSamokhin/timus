/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    let result = [0];
    let digits = str.trim().split('');
    let multiplier = 1;
    if (digits.length) {
        multiplier = digits[0] === '-' ? -1 : 1;
        if (digits[0] === '-' || digits[0] === '+') digits.shift();
        while (digits[0] == parseInt(digits[0])) {
            result.push(parseInt(digits.shift()));
        }
    }
    result = result.reduce((a, b, i, array) => a + b * Math.pow(10, array.length - i - 1), 0) * multiplier;
    return Math.abs(result) < Math.pow(2, 31) ? result : Math.pow(2, 31) * multiplier - (multiplier === -1 ? 0 : 1);
};