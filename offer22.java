//输入一个链表，输出该链表中倒数第k个节点。
//为了符合大多数人的习惯，本题从1开始计数，
//即链表的尾节点是倒数第1个节点。
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//返回链表 4->5.
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