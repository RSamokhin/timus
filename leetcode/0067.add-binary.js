/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let add = '0';
    let aIndex = a.length - 1;
    let bIndex = b.length - 1;
    let result = [];
    while (aIndex >= 0 || bIndex >= 0 || add === '1') {
        if ((a[aIndex] === '1') && (b[bIndex] === '1') & (add === '1')) {
            result.push('1');
        } else if ((a[aIndex] === '1') && (b[bIndex] === '1')) {
            result.push('0');
            add = '1';
        } else if ((a[aIndex] | '0') === (b[bIndex] | '0')) {
            result.push(add);
            add = '0';
        } else if (add === '1') {
            result.push('0');
        } else {
            result.push('1');
        }
        aIndex --;
        bIndex --;
    }
    return result.reverse().join('');
};