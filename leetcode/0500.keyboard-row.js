/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    let kb = {
        1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0, 0: 0,
        q: 1, w: 1, e: 1, r: 1, t: 1, y: 1, u: 1, i: 1, o: 1, p: 1,
        a: 2, s: 2, d: 2, f: 2, g: 2, h: 2, j: 2, k: 2, l: 2,
        z: 3, x: 3, c: 3, v: 3, b: 3, n: 3, m: 3
    };
    return words.filter(w => [].every.call(w.toLowerCase(), (l, i, arr) => kb[l] === kb[arr[0]]));
};