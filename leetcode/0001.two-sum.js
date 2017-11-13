/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }
    return true;
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let m = {};
    let result = [];
    s: {
        for (let i = 0; i < nums.length; i++) {
            let n = nums[i];
            m[target - n] = i;
            let index = nums.findIndex((num, ind) => m[num] !== ind && m[num] !== undefined);
            if (index >= 0) {
                result = [index, m[nums[index]]];
                break s;
            }
        }
    }

    return result;
};



/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let m = {};
    nums.forEach((n,i) => {m[target - n] = i});
    let index =  nums.findIndex((n,i) => m[n] !== i && m[n] !== undefined);
    return [index, m[nums[index]]];
};

console .log(twoSum([3,3], 6));
console .log(twoSum([2,5,5,11], 10));