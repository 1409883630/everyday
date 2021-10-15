//NC78 反转链表
//输入一个链表，反转链表后，输出新链表的表头。
public class Solution {
    public ListNode ReverseList(ListNode head) {
        //头节点，当前节点，下一节点
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
       return prev;//返回头节点
    }
}
