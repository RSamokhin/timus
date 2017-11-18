/**
 * @param {number} n
 * @return {string[]}
 */
const FIZZ = 'Fizz';
const BUZZ = 'Buzz';
var fizzBuzz = function(n) {
    let fizz = 1, buzz = 1;
    let result = [];
    for (let i = 1; i <= n; i++) {
        let np = i.toString();
        if (fizz === 3 && buzz === 5) {
            np = FIZZ + BUZZ;
            fizz = 1;
            buzz = 1;
        } else if (buzz === 5) {
            np = BUZZ;
            buzz = 1;
            fizz ++;
        } else if (fizz === 3) {
            np = FIZZ;
            fizz = 1;
            buzz ++;
        } else {
            fizz ++;
            buzz ++;
        }
        result.push(np);
    }
    return result;
};