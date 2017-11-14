/**
 * @param {string} s
 * @return {number}
 */
// var lengthOfLongestSubstring = function(s) {
//     let sub = 0;
//     let currentSub = '';
//     for (let i = 0; i < s.length; i++) {
//         let indexInCurrentSub = currentSub.indexOf(s[i]);
//         if (indexInCurrentSub === -1) {
//             currentSub += s[i];
//             sub = Math.max(currentSub.length,sub);
//         } else {
//             sub = Math.max(currentSub.length,sub);
//             currentSub = currentSub.substr(indexInCurrentSub + 1);
//             currentSub += s[i];
//         }
//     }
//     return sub;
// };

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let l = 0; // frame length
    let i = 0; // frame start point
    while (l + i < s.length) {
        let substr = s.substring(i, i + l + 1);
        let set = new Set(substr);
        if (set.size === substr.length) {
            l++; // enlarge frame size
        } else {
            i++; // move frame
        }
    }
    return l;
};

console.log(lengthOfLongestSubstring("a"));