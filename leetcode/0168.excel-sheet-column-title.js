/**
 * @param {number} n
 * @return {string}
 */
var convertToTitle = function(n) {
    let str = (n).toString(26);
    const delta = 48; //(разница между 0 и a кодом)
    return [].reduce.call(str, (a, b, i) => {
        let next;
        next = b == parseInt(b) ? String.fromCharCode(b.charCodeAt(0) + delta) : String.fromCharCode(b.charCodeAt(0) + 9);
        return a += next;
    }, '').split('`').map((m, i, array) => {
        if (i < array.length - 1) {
            m = m.slice(0,m.length-1) + String.fromCharCode(m[m.length - 1].charCodeAt(0) - 1);
        }
        return m.replace(/a`/g, 'z');
    }).join('Z').toUpperCase().replace(/`/g, '');
};