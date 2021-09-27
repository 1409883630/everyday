//NC14 ��֮����˳���ӡ������
//����һ�������������ظö�������֮���β������������һ��������ң���һ���������һֱ�������棩
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        if (pRoot == null) return listList;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(pRoot);
        int count = 1; // ��¼����
        while (!deque.isEmpty()) {
            int n = deque.size();
            ArrayList<Integer> iList = new ArrayList<>();
            // ������ǰ����
            for (int i = 0; i < n; i++) {
                TreeNode node = deque.pop();
                int m = count % 2;
                // ����Ϊ����ĩβ���Ԫ�أ�����Ϊż��ͷ�����Ԫ��
                iList.add(m * iList.size(), node.val);
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }
            listList.add(iList);
            count++;
        }
        return listList;
    }
}