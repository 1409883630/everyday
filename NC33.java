//NC33 �ϲ��������������
//���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode ans = new ListNode(0), root = ans;
        ListNode temp1 = list1, temp2 = list2;
        while(temp1 != null && temp2 != null) {
            if(temp1.val < temp2.val) {
                root.next = temp1;
                temp1 = temp1.next;
            } else {
                root.next = temp2;
                temp2 = temp2.next;
            }
            root = root.next;
        }
        root.next = temp1 == null ? temp2 : temp1;
        return ans.next;
    }
}