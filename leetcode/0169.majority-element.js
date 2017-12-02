/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort((a, b) => a - b);
    return nums[Math.floor(nums.length / 2)]
};

/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let count = 0;
    let most;
    nums.forEach(n => {
        if (!count) {
            most = n;
            count ++;
        } else {
            if (n === most) {
                count ++;
            } else {
                count --;
            }
        }
    })
    return most;
};