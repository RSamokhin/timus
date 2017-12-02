/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    if (!headA || !headB) {
        return null;
    }

    let shift = 0;
    let a = headA;
    let b = headB;
    while (a.next && b.next) {
        a = a.next;
        b = b.next;
    }

    let slow = null, fast = null;
    let checkerSlow = null, checkerFast = null;
    if (a.next === null)  {
        slow = headA;
        checkerSlow = a
        fast = headB;
        checkerFast = b;
    } else {
        slow = headB;
        checkerSlow = b
        fast = headA;
        checkerFast = a;
    }

    while (checkerFast.next !== null) {
        checkerFast = checkerFast.next;
        shift ++;
    }

    if (checkerFast !== checkerSlow) {
        return null;
    }

    while (shift) {
        fast = fast.next;
        shift --;
    }

    while (fast !== slow) {
        fast = fast.next;
        slow = slow.next;
    }

    return fast;
};