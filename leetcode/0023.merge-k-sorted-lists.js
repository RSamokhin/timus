/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function(lists) {
    let firstNode = null;
    let newList = null;
    top:
    while (true) {
        let minIndex = 0;
        let ifBreak = true;
        lists.forEach((l, i) => {
            if (l && (lists[minIndex] === null || l.val < lists[minIndex].val)) {
                minIndex = i;
            }
            if (lists[minIndex]) {
                ifBreak = false;
            }
        });
        if (ifBreak) break;
        if (!firstNode) {
            firstNode = lists[minIndex];
            newList = lists[minIndex];
        } else {
            newList.next = lists[minIndex];
            newList = newList.next;
        }
        lists[minIndex] = lists[minIndex].next;
    }
    return firstNode;
};

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function(lists) {
    let resultListArray = [];
    lists.forEach(l => {
       while (l) {
           resultListArray.push(l);
           l = l.next;
       }
    });
    resultListArray.sort((a, b) => a.val - b.val);
    resultListArray.forEach((a, i, array) => {
        a.next = array[i + 1] || null
    });
    return resultListArray.length ? resultListArray[0] : null;
};