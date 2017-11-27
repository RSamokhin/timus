/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    let result = [];
    let dict = {
        1: ['*'],
        2: ['a', 'b', 'c'],
        3: ['d', 'e', 'f'],
        4: ['g', 'h', 'i'],
        5: ['j', 'k', 'l'],
        6: ['m', 'n', 'o'],
        7: ['p', 'q', 'r', 's'],
        8: ['t', 'u', 'v'],
        9: ['w', 'x', 'y', 'z']
    };
    if (digits && [].every.call(digits, d => ~Object.keys(dict).indexOf(d))) {
        result.push('');
        [].forEach.call(digits, d => {
            let currentResult = result.slice();
            dict[d].forEach(p => {
                result = result.concat(currentResult.map(r => r += p));
            })
        })
    }

    return result.filter(r => r.length === digits.length);
};