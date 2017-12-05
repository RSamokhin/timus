/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let steps = {L: 0, R: 0, U: 0, D: 0};
    [].forEach.call(moves, m => {steps[m] ++});
    return steps.L === steps.R && steps.U === steps.D;
};

/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let v = 0;
    let g = 0;
    [].forEach.call(moves, m => {
        if (m === 'L') g ++;
        else if (m === 'R') g --;
        else if (m === 'U') v ++;
        else v --;
    });
    return v === 0 && g === 0;
};

/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let v = 0;
    let g = 0;
    [].forEach.call(moves, m => {
        switch (m) {
            case 'L':
                g ++;
                break;
            case 'R':
                g --;
                break;
            case 'U':
                v ++;
                break;
            case 'D':
                v --;
                break;
        }
    });
    return v === 0 && g === 0;
};