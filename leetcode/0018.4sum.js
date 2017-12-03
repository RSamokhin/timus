/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function(nums, target) {
    let result = [];
    nums.sort((a, b) => a - b);
    for (let i = 0; i < nums.length - 3; i ++) {
        if (nums[i] > target / 4) break;
        if (nums[i] === nums[i - 1]) continue;
        for (let j = i + 1; j < nums.length - 2; j ++) {
            if (nums[j] === nums[j - 1] && i !== j - 1) continue;
            let left = j + 1,
                right = nums.length - 1,
                prevSum = nums[i] + nums[j];
            while (left < right) {
                if (nums[left] + nums[right] + prevSum === target) {
                    result.push([nums[i], nums[j], nums[left], nums[right]]);
                    left ++;
                    right --;
                    while(nums[left] === nums[left - 1]) {
                        left ++;
                    }
                    while(nums[right] === nums[right + 1]) {
                        right --;
                    }
                }
                if (nums[left] < target - prevSum - nums[right]) {
                    left ++;
                }
                if (nums[right] > target - prevSum - nums[left]) {
                    right --;
                }
            }
        }
    }
    return result;
};