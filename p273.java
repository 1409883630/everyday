//237. ɾ�������еĽڵ�
//���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㡣
//���뺯����Ψһ����Ϊ Ҫ��ɾ���Ľڵ� ��
class Solution {
    public void deleteNode(ListNode node) {
       node.val=node.next.val;
       node.next=node.next.next;
    }
}