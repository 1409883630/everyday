//203. 移除链表元素
//给你一个链表的头节点 head 和一个整数 val ，
//请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
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
