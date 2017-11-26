/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    nums1.splice(m, nums1.length - m);
    nums2.splice(n, nums2.length - n);
    let i = m + n - 1;
    while (i >= 0) {
        if (nums1[m - 1] > nums2[n - 1] || nums2[n - 1] === undefined) {
            nums1[i] = nums1[m - 1];
            m--;
        } else {
            nums1[i] = nums2[n - 1];
            n --;
        }
        i --;
    }
};