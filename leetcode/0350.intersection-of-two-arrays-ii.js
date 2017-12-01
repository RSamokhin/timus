/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    let d1 = {}, d2 = {};
    nums1.forEach(n => d1[n] = d1[n] ? d1[n] + 1 : 1);
    nums2.forEach(n => d2[n] = d2[n] ? d2[n] + 1 : 1);
    let result = [];
    Object.keys(d1).forEach(k => {
        if (d2[k]) {
            for (let i = 0; i < Math.min(d2[k], d1[k]); i ++) {
                result.push(parseInt(k));
            }
        }
    });
    return result;
};

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    let d1 = {};
    let result = [];
    nums1.forEach(n => d1[n] = d1[n] ? d1[n] + 1 : 1);
    nums2.forEach(n => {
        if (d1[n]) {
            result.push(n);
            d1[n]--;
        }
    });
    return result;
};