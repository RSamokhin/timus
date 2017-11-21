/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let length = nums.length-1;
    for (let i = 0; i <= length; i++) {
        while (nums[i] === val && i <= length) {
            let tmp = nums[i];
            nums[i] = nums[length];
            length --;
        }
    }
    return length + 1;
};