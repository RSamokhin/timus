/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let result = 0
    while (height.length) {
        while (height.length && !height[0]) height.shift();
        while (height.length && !height[height.length - 1]) height.pop();
        result += height.filter(h => !h).length;
        height = height.map(h => h ? --h : 0);
    }
    return result;
};

/**
 * @param {number[]} height
 * @return {number}
 */

var trap = function(height) {
    let result = 0;
    while (heignt.length - 1) {
        let max1 = Math.max(height);
        let max1Index = height.indexOf(max1);
        let max2 = Math.max(height.filter((h, i) => i !== max1Index));
        let max2Index = height.lastIndexOf(max2);
        if (max1Index < max2Index) {
            let tmp = max2Index;
            max2Index = max1Index;
            max1Index = tmp;
        }

        let betweensArray = height.slice(max1Index + 1, max2Index);
        console.log(betweensArray);

        height.pop()

    }
    return result;
};

/**
 * @param {number[]} height
 * @return {number}
 */

var trap = function(height) {
    let result = 0;
    let left = 0, right = height.length - 1, leftMax = 0, rightMax = 0;
    while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                result += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                result += rightMax - height[right];
            }
            right --;
        }
    }
    return result;
};