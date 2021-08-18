//NC40 �������������������
//����������ÿһ���ڵ��ֵ���� 0 - 9 ֮�䣬��ô��������Ϳ��Դ���һ��������
//���������������������ɴ��������������ֵ�Ľ������
//���磺���� 1 Ϊ 9->3->7������ 2 Ϊ 6->3����������µĽ������Ϊ 1->0->0->0��
import java.util.*;
public class Solution {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        // �����пմ���
        if(head1 == null)
            return head2;
        if(head2 == null){
            return head1;
        }
        // ��תh1����
        head1 = reverse(head1);
        // ��תh2����
        head2 = reverse(head2);
        // �����µ�����ͷ�ڵ�
        ListNode head = new ListNode(-1);
        ListNode nHead = head;
        // ��¼��λ����ֵ
        int tmp = 0;
        while(head1 != null || head2 != null){
            // val�����ۼӴ�ʱ����ֵ������+����+��һλ�Ľ�λ=��ǰ�ܵ���ֵ��
            int val = tmp;
            // ���ڵ㲻Ϊ�յ�ʱ������Ҫ���ϵ�ǰ�ڵ��ֵ
            if (head1 != null) {
                val += head1.val;
                head1 = head1.next;
            }
            // ���ڵ㲻Ϊ�յ�ʱ������Ҫ���ϵ�ǰ�ڵ��ֵ
            if (head2 != null) {
                val += head2.val;
                head2 = head2.next;
            }
            // �����λ
            tmp = val/10;
            // ��λ��ʣ�µ���ֵ��Ϊ��ǰ�ڵ����ֵ
            nHead.next = new ListNode(val%10);
            // ��һ���ڵ�
            nHead = nHead.next;
 
        }
        // ����������������ʱ�򣬽�λ��Ϊ0��ʱ������Ҫ�ټ��������λ
        if(tmp > 0){
            nHead.next = new ListNode(tmp);
        }
        // ���·�ת��������
        return reverse(head.next);
    }
 
    // ��ת����
    ListNode reverse(ListNode head){
        if(head == null)
            return head;
        ListNode cur = head;
        ListNode node = null;
        while(cur != null){
            ListNode tail = cur.next;
            cur.next = node;
            node = cur;
            cur = tail;
        }
        return node;
    }
}