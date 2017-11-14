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
var addTwoNumbers = function(l1, l2) {
    let tmp = l1.val + l2.val;
    let add = tmp > 9 ? 1 : 0;
    let firstNode = new ListNode(tmp % 10);
    let prev  = firstNode;
    while (l1.next || l2.next || add) {
        l1 = l1.next || {};
        l2 = l2.next || {};
        tmp = (l1.val||0) + (l2.val||0) + add;
        let newNode = new ListNode(tmp % 10);
        prev.next = newNode;
        prev = newNode;
        add = tmp > 9 ? 1 : 0;
    }
    return firstNode;
};