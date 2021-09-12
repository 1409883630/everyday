//NC24 删除有序链表中重复的元素-II
//给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素
//例如：给出的链表为1→2→3→3→4→4→5, 返回1→2→5
import java.util.*;
public class Solution {
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
