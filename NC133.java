//NC133 �������ż����
//����һ�����������趨һ�������������������λ�ڵ��ż��λ�ڵ�ֱ����һ�����ź������
//ע���ǽڵ�ı�Ŷ��ǽڵ����ֵ��
import java.util.*;
public class Solution {
    public ListNode oddEvenList (ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode evenHead = head.next;
        ListNode odd = head,even = head.next;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}