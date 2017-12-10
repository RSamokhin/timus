/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    function split(s) {
        let result = [];
        let w = '';
        [].forEach.call(s, (l, i) => {
            if (l === ' ' && w.length) {
                result.push(w);
                w = '';
            }
            else if (l !== ' ') {
                w += l;
            }
            if (w.length && i === s.length - 1) {
                result.push(w);
            }
        });
        return result;
    }

    function join(arr, sep) {
        let result = '';
        arr.forEach((w, i) => {
            result += w;
            if (i !== arr.length - 1) {
                result += sep;
            }
        });
        return result;
    }

    function reverse(w) {
        return [].reduceRight.call(w, (a, b) => a + b, '');
    }

    return join(split(s).map(w => reverse(w)), ' ');
};