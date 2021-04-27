//剑指 Offer 18. 删除链表的节点
//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
//返回删除后的链表的头节点。
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