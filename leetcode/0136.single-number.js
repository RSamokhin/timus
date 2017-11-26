/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let dict = {};
    nums.forEach(n =>  {dict[n] = dict[n] === undefined ? 0 : 1});
    return parseInt(Object.keys(dict).find(k => !dict[k]));
};