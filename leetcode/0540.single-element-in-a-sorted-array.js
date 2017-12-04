/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    let left = 0;
    let right = nums.length - 1;
    function findSingleRecursive(left, right) {
        if (left === right) {
            return nums[left];
        }
        let middle = Math.floor(left + (right - left) / 2);
        if (middle % 2) {
            if (nums[middle] === nums[middle + 1]) {
                return findSingleRecursive(left, middle - 1)
            } else {
                return findSingleRecursive(middle + 1, right);
            }
        } else {
            if (nums[middle] === nums[middle + 1]) {
                return findSingleRecursive(middle + 1, right)
            } else {
                return findSingleRecursive(left, middle);
            }
        }


    };
    return findSingleRecursive(left, right);
};