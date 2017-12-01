/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a,b) => a - b);
    let result = [];
    console.log(nums);
    for (let i = 0; i < nums.length - 2; i ++) {
        if (nums[i] === nums[i - 1]) {
            continue;
        } else {
            let left = i + 1;
            let right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] === 0) {
                    result.push([nums[i], nums[left], nums[right]]);
                    do {
                        left ++;
                    } while (nums[left] === nums[left - 1]);
                    do {
                        right --
                    } while (nums[right] === nums[right + 1]);
                } else if (0 - nums[i] - nums[left] < nums[right]) {
                    right --;
                } else if (0 - nums[i] - nums[right] > nums[left]) {
                    left ++;
                }
            }
        }
    }
    return result;
};