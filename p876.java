//876. ������м���
//����һ��ͷ���Ϊ head �ķǿյ���������������м��㡣
//����������м��㣬�򷵻صڶ����м��㡣

public ListNode middleNode(ListNode head) {
	//���÷���
        int co = length(head);
        ListNode cur1 = head;
            for (int i = 1; i <= (co / 2) ; i++) {
                cur1 = cur1.next;
            }
            return cur1;
        }

//дһ���������ȵķ���
    public static int length(ListNode head){
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }