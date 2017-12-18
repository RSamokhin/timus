/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    let sumS = [].reduce.call(s, (a, b) => a + b.charCodeAt(0), 0);
    let sumT = [].reduce.call(t, (a, b) => a + b.charCodeAt(0), 0);
    return String.fromCharCode(sumT - sumS);
};