//����һ����������������е�����k���ڵ㡣
//Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ������
//�������β�ڵ��ǵ�����1���ڵ㡣
//����һ������: 1->2->3->4->5, �� k = 2.
//�������� 4->5.
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }

        ListNode kcur=head;
        for(int i=0;i<count-k;i++){
            kcur=kcur.next;
        }
        
        return kcur;
    }
}