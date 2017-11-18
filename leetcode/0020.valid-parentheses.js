/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let queue = s.split('');
    let pairs = {'(': ')', '{': '}', '[': ']'}
    let stack = [];
    while (queue.length) {
        let q = queue.shift();
        let r = stack[stack.length - 1];
        if (pairs[r] === q) {
            stack.pop();
        } else {
            stack.push(q);
        }
    }

    return !stack.length;
};