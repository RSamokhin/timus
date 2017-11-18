/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let commonPrefix = strs.length ? strs[0] : '';
    strs.forEach(s => {
        for (let i = 0; i < Math.max(s.length, commonPrefix.length); i++) {
            if (s[i] !== commonPrefix[i]) {
                commonPrefix = s.substring(0, i);
                break;
            }
        }
    })
    return commonPrefix;
};