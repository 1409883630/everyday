//NC14 按之字形顺序打印二叉树
//给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        if (pRoot == null) return listList;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(pRoot);
        int count = 1; // 记录层数
        while (!deque.isEmpty()) {
            int n = deque.size();
            ArrayList<Integer> iList = new ArrayList<>();
            // 遍历当前队列
            for (int i = 0; i < n; i++) {
                TreeNode node = deque.pop();
                int m = count % 2;
                // 层数为奇数末尾添加元素，层数为偶数头部添加元素
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