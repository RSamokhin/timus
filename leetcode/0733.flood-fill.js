/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} newColor
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, newColor) {
    let sourceColor = image[sr][sc];
    function colorRecursive (x, y) {
        if (image[x][y] === sourceColor) {
            image[x][y] = newColor;
            if (x - 1 >= 0) colorRecursive(x - 1, y);
            if (x + 1 < image.length) colorRecursive(x + 1, y);
            if (y - 1 >= 0) colorRecursive(x, y - 1);
            if (y + 1 < image[0].length) colorRecursive(x, y + 1);

        }
    }
    if (newColor !== sourceColor) {
        colorRecursive(sr,sc);
    }
    return image;
};