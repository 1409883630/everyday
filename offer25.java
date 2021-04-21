//剑指 Offer 25. 合并两个排序的链表
//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//建立一个新的链表，然后将两个数组合并到新数组中
            ListNode ss = new ListNode(0);
            ListNode cur = ss;
			//限定条件
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
            //比较l1 和l2，如果某个不为空，返回值给cur.next;
            cur.next = l1 != null ? l1 : l2;
            return ss.next;
    }
}