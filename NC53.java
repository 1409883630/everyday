//NC53 ɾ������ĵ�����n���ڵ�
//����һ������ɾ������ĵ����� n ���ڵ㲢���������ͷָ��
import java.util.*;
public class Solution {
    /**
     * 
     * @param head ListNode�� 
     * @param n int���� 
     * @return ListNode��
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
         if(head == null)
            return null;
        Stack<Integer> stack = new Stack<>();
        //��ջ
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        //��ջ
        while(!stack.empty()) {
            n--;
            ListNode tmpNode = new ListNode(stack.pop());
            //������n��
            if(n != 0) {
                //ǰ�巨
                tmpNode.next = head;
                head = tmpNode;
            }
        }
        return head;
    }
}