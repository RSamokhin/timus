/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let sub = 0;
    let currentSub = '';
    for (let i = 0; i < s.length; i++) {
        let indexInCurrentSub = currentSub.indexOf(s[i]);
        if (indexInCurrentSub === -1) {
            currentSub += s[i];
            sub = Math.max(currentSub.length,sub);
        } else {
            sub = Math.max(currentSub.length,sub);
            currentSub = currentSub.substr(indexInCurrentSub + 1);
            currentSub += s[i];
        }
    }
    return sub;
};

console.log(lengthOfLongestSubstring('abca'));