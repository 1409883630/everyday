//NC50 �����еĽڵ�ÿk��һ�鷭ת
//�������������еĽڵ�ÿ\ k k ��һ�鷭ת�����ط�ת�������
//��������еĽڵ�������\ k k �ı����������ʣ�µĽڵ㱣��ԭ��
//�㲻�ܸ��Ľڵ��е�ֵ��ֻ�ܸ��Ľڵ㱾��
//Ҫ��ռ临�Ӷ� \ O(1) O(1)
//���磺������������1\to2\to3\to4\to51��2��3��4��5
//���� \ k = 2 k=2, ��Ӧ�÷��� 2\to 1\to 4\to 3\to 52��1��4��3��5
//���� \ k = 3 k=3, ��Ӧ�÷��� 3\to2 \to1 \to 4\to 53��2��1��4��5
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
     * @param head ListNode�� 
     * @param k int���� 
     * @return ListNode��
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