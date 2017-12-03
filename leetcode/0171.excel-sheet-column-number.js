/**
 * @param {string} s
 * @return {number}
 */
var titleToNumber = function(s) {
    let array = [ 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' ];
    return [].reduce.call(s, (a, b, i) => {
        return a * 26 + (array.indexOf(b) + 1);
    }, 0);
};