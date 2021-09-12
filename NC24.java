//NC24 ɾ�������������ظ���Ԫ��-II
//����һ���������������ɾ�������е������ظ����ֵ�Ԫ�أ�ֻ����ԭ������ֻ����һ�ε�Ԫ��
//���磺����������Ϊ1��2��3��3��4��4��5, ����1��2��5
import java.util.*;
public class Solution {
    /**
     * 
     * @param head ListNode�� 
     * @return ListNode��
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null) return null;
        Map<Integer,Integer> map = new HashMap<>();
        ListNode cur =head;
        while(head != null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head =head.next;
        }
        ListNode temp = new ListNode(-1);
        ListNode p = temp;
        while(cur != null){
            if(map.get(cur.val)==1){
                ListNode x = new ListNode(cur.val);
                p.next = x;
                p = p.next;
            }
            cur =cur.next;
        }
        return temp.next;
    }
}