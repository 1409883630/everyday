//203. �Ƴ�����Ԫ��
//����һ�������ͷ�ڵ� head ��һ������ val ��
//����ɾ���������������� Node.val == val �Ľڵ㣬������ �µ�ͷ�ڵ� ��
 class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ss=new ListNode(0);
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
