/**
 * @param {number[][]} grid
 * @return {number}
 */
let globalGrid;
let currentSum = 0;
var maxAreaOfIsland = function(grid) {
    globalGrid = grid;
    let maxIslandS = 0;
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            let newIslandS = calcSRecurcive(i,j);
            maxIslandS = Math.max(maxIslandS, currentSum);
            currentSum = 0;
        }
    }
    return maxIslandS;
};
function calcSRecurcive (x, y) {
    if (globalGrid[x] && globalGrid[x][y]) {
        currentSum++;
        globalGrid[x][y] = 0;
        calcSRecurcive(x, y-1);
        calcSRecurcive(x, y+1);
        calcSRecurcive(x+1, y);
        calcSRecurcive(x-1, y);
    }
}