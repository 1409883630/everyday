//NC3 �����л�����ڽ��
//��һ�����������а����������ҳ�������Ļ�����ڽ�㣬���򣬷���null
//���������������Ϊ2�Σ���һ�����뻷ǰ�������֣�
//�ڶ����������Ĳ��֣���̨����2������װ��һ���л������޻�������
//����ֵ��������������Ļ�����ڽ�㼴�ɡ������Ǻ�̨������ӡ����ڵ�
import java.util.*;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        // ʹ��set����¼���ֵĽ��
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null){
           // ��set�а�����㣬˵����һ�γ����ظ��Ľ�㣬��������ڽ��
            if(set.contains(pHead)){
                return pHead;
            }
            // set�м���δ�ظ��Ľ��
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}