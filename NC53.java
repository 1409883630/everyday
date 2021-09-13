//NC53 删除链表的倒数第n个节点
//给定一个链表，删除链表的倒数第 n 个节点并返回链表的头指针
import java.util.*;
public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
         if(head == null)
            return null;
        Stack<Integer> stack = new Stack<>();
        //入栈
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        //出栈
        while(!stack.empty()) {
            n--;
            ListNode tmpNode = new ListNode(stack.pop());
            //跳过第n个
            if(n != 0) {
                //前插法
                tmpNode.next = head;
                head = tmpNode;
            }
        }
        return head;
    }
}