/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let max = 0;
    let currSeq = 0;
    nums.forEach((n, i) => {
        if (n) currSeq ++;
        if (!n || i === nums.length - 1) {
            max = Math.max(max, currSeq);
            currSeq = 0;
        }
    });
    return max;
};