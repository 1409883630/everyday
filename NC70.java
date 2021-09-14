//NC70 �����������
//����һ����������ʵ�ֵ����������(����������)
import java.util.*;
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
public class Solution {
    public ListNode sortInList (ListNode head) {
        // write code here
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        while (true) {
            ListNode next = tmp.next;
            ListNode pre = tmp;
            boolean flag = true;
            while (next.next != null) {
                if (next.val > next.next.val) {
                    ListNode ne1 = next.next.next;
                    pre.next = next.next;
                    next.next.next = next;
                    next.next = ne1;
                    pre = pre.next;
                    flag = false;
                } else {
                    pre = pre.next;
                    next = next.next;
                }
            }
            if (flag) {
                break;
            }
        }
        return tmp.next;
    }
}