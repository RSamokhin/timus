/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let steps = {L: 0, R: 0, U: 0, D: 0};
    [].forEach.call(moves, m => {steps[m] ++});
    return steps.L === steps.R && steps.U === steps.D;
};