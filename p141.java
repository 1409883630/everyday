//给定一个链表，判断链表中是否有环。

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode a= head;
        ListNode b=head;
        while(a!=null&&a.next!=null){
            a=a.next.next;
            b=b.next;
            if(a==b){
                return true;
            }
        }
        return false;
    }
}
