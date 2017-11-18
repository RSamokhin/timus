/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let sum = nums.reduce((a,b) => a + b, 0);
    let index = -1;
    let sumAtIndex = 0;
    for(let i = 0; i < nums.length; i++) {
        if (sumAtIndex === sum - sumAtIndex - nums[i]) {
            index = i;
            break;
        }
        sumAtIndex += nums[i];
    }
    return index;
};