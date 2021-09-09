//NC50 链表中的节点每k个一组翻转
//将给出的链表中的节点每\ k k 个一组翻转，返回翻转后的链表
//如果链表中的节点数不是\ k k 的倍数，将最后剩下的节点保持原样
//你不能更改节点中的值，只能更改节点本身。
//要求空间复杂度 \ O(1) O(1)
//例如：给定的链表是1\to2\to3\to4\to51→2→3→4→5
//对于 \ k = 2 k=2, 你应该返回 2\to 1\to 4\to 3\to 52→1→4→3→5
//对于 \ k = 3 k=3, 你应该返回 3\to2 \to1 \to 4\to 53→2→1→4→5
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