/**
 * @param {number[][]} nums
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(nums, r, c) {
    if (!nums.length || r * c !== nums.length * nums[0].length) {
        return nums;
    }
    rn = nums.length;
    rh = nums[0].length;
    let result = [];
    let resultRow = [];
    nums.forEach(numsRow =>{
        while (numsRow.length) {
            let l = c - resultRow.length;
            // console.log('l', l)
            resultRow = resultRow.concat(numsRow.slice(0, l));
            // console.log('resultRow', resultRow)
            numsRow = numsRow.slice(l);
            // console.log('numsRow', numsRow)
            if (resultRow.length === c) {
                result.push(resultRow);
                resultRow = [];
            }
            // console.log('============')
        }
    });
    return result;
};