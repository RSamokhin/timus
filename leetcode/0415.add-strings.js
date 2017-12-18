/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let add = 0;
    let i1 = num1.length - 1;
    let i2 = num2.length - 1;
    let result = []
    while (i1 >= 0 || i2 >= 0 || add) {
        let d1 = num1[i1--];
        let d2 = num2[i2--];
        let r = (d1 | 0) + (d2 | 0) + add;
        result.push(r % 10);
        add = (r > 9) ? 1 : 0;
    }
    return result.reverse().join('');
};