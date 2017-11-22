/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let left = 0, right = s.length - 1;
    let result = true;
    while (left <= right) {
        if (s[left].toUpperCase() === s[left].toLowerCase() && s[left] != parseInt(s[left])) {
            left ++;
        } else if (s[right].toUpperCase() === s[right].toLowerCase() && s[right] != parseInt(s[right])){
            right --;
        } else if (s[left].toLowerCase() === s[right].toLowerCase()) {
            left ++;
            right --;
        } else {
            result = false;
            break;
        }

    }
    return result;

};