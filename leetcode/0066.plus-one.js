/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let index = digits.length - 1;
    let add = 1;
    while (add) {
        if (index === -1) {
            index = 0;
            digits.unshift(0);
        }
        let newDigit = digits[index] + add;
        digits[index] = newDigit % 10;
        add = newDigit > 9
        index --;
    }
    return digits;
};