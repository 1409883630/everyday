//��ָ Offer 18. ɾ������Ľڵ�
//�������������ͷָ���һ��Ҫɾ���Ľڵ��ֵ������һ������ɾ���ýڵ㡣
//����ɾ����������ͷ�ڵ㡣
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
         ListNode ss = new ListNode(0);
         ss.next=head;
         ListNode prev=ss;
         ListNode cur=head;
         while(cur!=null){
             if(cur.val==val){
                   prev.next=cur.next;
             }else
                 prev=cur;
                 cur=cur.next;
             
         }
         return ss.next;
    }
}