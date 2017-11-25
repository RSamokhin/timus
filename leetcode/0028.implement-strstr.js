/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if (needle.length === 0)
        return 0;
    let result = -1;
    for (let i = 0; i < haystack.length - needle.length + 1; i ++) {
        if (haystack[i] === needle[0]) {
            let contains = true;
            for (let j = 1; j < needle.length; j ++) {
                if (haystack[i + j] !== needle [j]) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                result = i;
                break;
            }
        }
    }
    return result;
};