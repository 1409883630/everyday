//NC50 链表中的节点每k个一组翻转
//将给出的链表中的节点每 k 个一组翻转，返回翻转后的链表
//如果链表中的节点数不是 k 的倍数，将最后剩下的节点保持原样
//你不能更改节点中的值，只能更改节点本身。
//要求空间复杂度  O(1) 
//例如：给定的链表是1→2→3→4→5
//对于 k=2, 你应该返回 2→1→4→3→5
//对于 k=3, 你应该返回 3→2→1→4→5
import java.util.*;
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
         Stack<Integer> stack=new Stack<>();
        ListNode newNode=new ListNode(0);
        ListNode temp=newNode;
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        int time=len/k;
        for(int i=0;i<time;i++){
            for(int j=0;j<k;j++){
                stack.push(head.val);
                head=head.next;
            }
            while(!stack.isEmpty()){
                temp.next=new ListNode(stack.pop());
                temp=temp.next;
            }
        }
        while(head!=null){
            temp.next=head;
            temp=temp.next;
            head=head.next;
        }
        return newNode.next;
    }
}
