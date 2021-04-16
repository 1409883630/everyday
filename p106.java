package day0313.leetcode.p160;
//求两个链表公共结点
import day0313.leetcode.ListNode;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int countA = length(headA);
        int countB = length(headB);

        ListNode curA = headA;
        ListNode curB = headB;
        if (countA > countB) {
            for (int i = 0; i < countA - countB; i++) {
                curA = curA.next;
            }
        } else if (countA < countB) {
            for (int i = 0; i < countB - countA; i++) {
                curB = curB.next;
            }
        }

        // 两个相遇 || 都 == null
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }

        return curA;
    }

    private int length(ListNode head) {
        int count = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            count++;
        }

        return count;
    }
}