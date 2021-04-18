//876. 链表的中间结点
//给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。

public ListNode middleNode(ListNode head) {
	//调用方法
        int co = length(head);
        ListNode cur1 = head;
            for (int i = 1; i <= (co / 2) ; i++) {
                cur1 = cur1.next;
            }
            return cur1;
        }

//写一个求链表长度的方法
    public static int length(ListNode head){
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }