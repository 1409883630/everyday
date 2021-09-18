//NC96 判断一个链表是否为回文结构
//给定一个链表，请判断该链表是否为回文结构。
import java.util.*;
public class Solution {
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null || head.next == null) return true;
        ListNode slow = head;//慢指针
        ListNode fast = head;//快指针
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //找到中间节点后让fast指针指向slow->next;
        fast = slow.next;
        slow.next = null;
        ListNode newList = null;
        while(fast != null){
            newList = fast.next;
            fast.next = slow;
            slow = fast;
            fast = newList;
        }
        newList = slow;
        fast = head;
        //判断回文
        while (fast != null && newList != null) {
            if (fast.val != newList.val) {
                return false;
            }
            fast = fast.next;
            newList = newList.next;
        }
        return true;
    }
}