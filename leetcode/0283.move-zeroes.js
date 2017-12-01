/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let zCount = 0;
    for (let i = 0; i < nums.length; i++) {
        if (!nums[i]) {
            zCount ++;
        } else {
            if (zCount) {
                nums[i - zCount] = nums[i];
            }
        }
    }
    for (let i = nums.length - 1; i >= nums.length - zCount; i--) {
        nums[i] = 0;
    }
};