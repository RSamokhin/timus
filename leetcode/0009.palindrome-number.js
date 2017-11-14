/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    if (x < 10) {
        return true;
    }
    let n = 0;
    while (Math.pow(10, n) < x) {
        n ++;
    }
    let c = 0;
    while(c <= n/2) {
        let l = Math.floor(x / Math.pow(10,n-c)) % 10;
        let r = Math.floor(x % Math.pow(10,c) / Math.pow(10,c - 1));
        // console.log(  l,  r   );
        c ++;
        if (l !== r) {
            return false
        }
    }
    return true;
};

console.log(isPalindrome(1));