/**
 * @param {string} licensePlate
 * @param {string[]} words
 * @return {string}
 */
var shortestCompletingWord = function(licensePlate, words) {
    let letters = {};
    [].forEach.call(licensePlate, w => {
        let u = w.toUpperCase();
        let l = w.toLowerCase();
        if (l !== u) {
            letters[l] = letters[l] ? letters[l] + 1 : 1;
        }
    });
    return words.filter(w => {
        w = w.toLowerCase();
        return Object.keys(letters).every(k => {
            return letters[k] <= w.split(k).length - 1
        });
    }).find((w, index, array) => w.length === Math.min.apply(null, array.map(a => a.length)));
};