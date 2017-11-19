/**
 * @param {number[]} candies
 * @return {number}
 */
var distributeCandies = function(candies) {
    let differentCandies = new Set(candies);
    return differentCandies.size >= candies.length / 2 ? candies.length / 2 : differentCandies.size
};