//��ָ Offer 25. �ϲ��������������
//����������������������ϲ�����������ʹ�������еĽڵ���Ȼ�ǵ�������ġ�
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//����һ���µ�����Ȼ����������ϲ�����������
            ListNode ss = new ListNode(0);
            ListNode cur = ss;
			//�޶�����
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    cur.next=l1;
                    l1=l1.next;
                }
               else{
                    cur.next=l2;
                    l2=l2.next;
               }
            cur=cur.next;
            }
            //�Ƚ�l1 ��l2�����ĳ����Ϊ�գ�����ֵ��cur.next;
            cur.next = l1 != null ? l1 : l2;
            return ss.next;
    }
}