/**
 * @param {number[][]} grid
 * @return {number}
 */
var islandPerimeter = function(grid) {
    let result = 0;
    grid.forEach((row, i) => {
        grid[i].forEach((s, j) => {
            if (s) {
                if (!i) result ++;
                else result += !grid[i - 1][j];

                if (!j) result ++;
                else result += !grid[i][j - 1];

                if (i === grid.length - 1) result ++;
                else result += !grid[i + 1][j];

                if (j === grid[0].length - 1) result ++;
                else result += !grid[i][j + 1];
            }
        });
    });
    return result;
};