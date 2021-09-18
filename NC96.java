//NC96 �ж�һ�������Ƿ�Ϊ���Ľṹ
//����һ���������жϸ������Ƿ�Ϊ���Ľṹ��
import java.util.*;
public class Solution {
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null || head.next == null) return true;
        ListNode slow = head;//��ָ��
        ListNode fast = head;//��ָ��
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //�ҵ��м�ڵ����fastָ��ָ��slow->next;
        fast = slow.next;
        slow.next = null;
        ListNode newList = null;
        while(fast != null){
            newList = fast.next;
            fast.next = slow;
            slow = fast;
            fast = newList;
        }
        newList = slow;
        fast = head;
        //�жϻ���
        while (fast != null && newList != null) {
            if (fast.val != newList.val) {
                return false;
            }
            fast = fast.next;
            newList = newList.next;
        }
        return true;
    }
}