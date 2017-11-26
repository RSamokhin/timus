/**
 * @param {string[]} words1
 * @param {string[]} words2
 * @param {string[][]} pairs
 * @return {boolean}
 */
var areSentencesSimilar = function(words1, words2, pairs) {
    let dict = {};
    pairs.forEach(p => {
        if (!dict[p[0]]) dict[p[0]] = [];
        if (!dict[p[1]]) dict[p[1]] = [];
        dict[p[0]].push(p[1]);
        dict[p[1]].push(p[0]);
    });

    if (words1.length !== words2.length) return false;
    return words1.every((w, i) => {
        return w === words2[i] || (dict[w] && ~dict[w].indexOf(words2[i]));
    });

};
