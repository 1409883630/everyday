//反转链表
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution{
public ListNode reverseList(ListNode head) {
    ListNode prev =null;
    ListNode cur = head;
    while(cur!=null){
       ListNode next=cur.next;

       cur.next=prev;
       prev=cur;
       cur=next;
        
    }
       return prev;
    }
 public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        for (ListNode cur = reverseList(n1); cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }
    }
