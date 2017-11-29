/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    let result = [[]];
    let shift = 0;
    for (let f = 0; f < nums.length; f++) {  
        // console.log('result be:', result);
        
        let addedNums = nums.slice(f);
        // console.log('addedNums: ', addedNums);
        
        let oldResult = result.slice(shift);
        // console.log('oldResult: ', oldResult);

        oldResult.forEach(o => {
            addedNums.forEach(a => {
                if (!~o.indexOf(a) && (!o.length || nums.indexOf(o[o.length - 1]) < nums.indexOf(a))) {
                    result.push(o.concat(a));
                }
            }) 
        });
        
        shift += oldResult.length;
        
        // console.log('result en:', result);
        // console.log('==========');
    }
    return result;
};


/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    let result = [];
    let totalCount = Math.pow(2, nums.length);
    for (let i = 0; i < totalCount; i ++) {
        let binaryString = (i >>> 0).toString(2).split('');
        while (binaryString.length < nums.length) binaryString.unshift('0');
        let newSet = [];
        binaryString.forEach((s, i) => {
             if (s === '1') {
                 newSet.push(nums[nums.length - i - 1])
             }
        });
        result.push(newSet);
    }

    return result;
};