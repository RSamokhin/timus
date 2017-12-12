/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    let node = head;
    let cycle = null;
    while (!cycle) {
        if (!node || !node.next) break;
        let slow = node;
        let fast = node;
        let timesMet = 0;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (!fast || !fast.next) {
                node = null;
                break;
            }

            if (fast === slow && node === slow) {
                cycle = node;
                break;
            }
            if (fast === slow) {
                timesMet ++;
            }
            if (timesMet > 2) {
                node = node.next;
                break;
            }
        }

    }

    return cycle;
};