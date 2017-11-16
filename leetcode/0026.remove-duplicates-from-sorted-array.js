/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 1;
    while (i < nums.length) {
        if (nums[i] === nums[i-1]) {
            nums.splice(i, 1);
        } else {
            i++;
        }
    }
    return nums.length;
};

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 0;
    for (let j = 1; j < nums.length; j++) {
        if (nums[j] !== nums[i]) {
            i ++;
            nums[i] = nums[j]
        }
    }
    return i+1;
};