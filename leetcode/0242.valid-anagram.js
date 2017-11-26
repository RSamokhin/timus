/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    return s.length === t.length && s.split('').sort().join('') === t.split('').sort().join('');
};

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;
    let dict = {};
    [].forEach.call(s, a => dict[a] = dict[a] ? dict[a] + 1 : 1);
    if ([].every.call(t, a => {
        if (dict[a] === undefined) {
            return false;
        }
        dict[a] --;
        return true;
    })) {
        return Object.keys(dict).every(k => dict[k] === 0);
    };
    return false;
};