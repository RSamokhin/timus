/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    if (!head.next) {
        return null;
    }

    let fast = head,
        slow = head;
    let i = 1;
    while (i < n) {
        fast = fast.next;
        i ++
    }
    while (fast.next && slow.next.next) {
        slow = slow.next;
        fast = fast.next;
    }
    if (n === 1) {
        slow.next = null;
    } else {
         slow.val = slow.next.val;
        slow.next = slow.next.next
    }

    return head
};