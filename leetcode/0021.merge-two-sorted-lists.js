/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let result = null, prev = null, current = null;
    while (l1 || l2) {
        let v1 = l1 ? l1.val : Number.MAX_SAFE_INTEGER;
        let v2 = l2 ? l2.val : Number.MAX_SAFE_INTEGER;
        if (v1 < v2) {
            current = l1;
            l1 = l1.next;
        } else {
            current = l2;
            l2 = l2.next;
        };
        if (!result) {
            result = current;
        } else {
            prev.next = current;
        }
        prev = current;

    }

    return result
};