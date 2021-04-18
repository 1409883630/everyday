 //回文链表
    public static boolean isPalindrome(ListNode head) {
        //找中间结点
        ListNode cur = middleNode(head);
        //反转后半部分链表
        ListNode cur1 = ss(cur);
        
        ListNode cur2 = head;
        ListNode cur3 = cur1;
        while (cur3 != null) {
            if (cur2.val != cur3.val) {
                return false;
            }
            cur2 = cur2.next;
            cur3 = cur3.next;
        }
        return true;
    }
    public static ListNode middleNode(ListNode head) {
        //调用方法
        int co = aa(head);
        ListNode cur1 = head;
        for (int i = 1; i <= (co / 2); i++) {
            cur1 = cur1.next;
        }
        return cur1;
    }
    public static int aa(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public static ListNode ss(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
