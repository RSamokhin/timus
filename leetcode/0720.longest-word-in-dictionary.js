/**
 * @param {string[]} words
 * @return {string}
 */
var longestWord = function(words) {
    let dict = {0:['']};
    words.forEach(w => {
        if (dict[w.length]) {
            dict[w.length].push(w);
        } else {
            dict[w.length] = [w];
        }
    });
    let i = 0;
    while (true) {
        if (!dict[i + 1]) break;
        let filteredNextLevel = dict[i + 1].filter(w => dict[i].some(prefix => !w.indexOf(prefix)));
        if (!filteredNextLevel.length) break;
        dict[i + 1] = filteredNextLevel;
        i++;
    }
    dict[i].sort();
    return dict[i][0];
};