//NC78 ��ת����
//����һ��������ת��������������ı�ͷ��
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
       return prev;//����ͷ�ڵ�
    }
}