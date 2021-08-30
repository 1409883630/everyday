//NC102 �ڶ��������ҵ������ڵ�������������
//����һ�ö�����(��֤�ǿ�)�Լ�������ϵ������ڵ��Ӧ��valֵ o1 �� o2�����ҵ� o1 �� o2 ������������Ƚڵ㡣
//ע�����Ᵽ֤��������ÿ���ڵ��valֵ������ͬ��
import java.util.*;
public class Solution {
    /**
     * 
     * @param root TreeNode�� 
     * @param o1 int���� 
     * @param o2 int���� 
     * @return int����
     */
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        TreeNode tar = lowestCommonAncestor2(root,o1,o2);
        return tar.val;
    }
    public TreeNode lowestCommonAncestor2 (TreeNode root, int o1, int o2) {
        if(root == null || root.val == o1 || root.val == o2){
            return root;
        }
        TreeNode l = lowestCommonAncestor2(root.left,o1,o2);
        TreeNode r = lowestCommonAncestor2(root.right,o1,o2);
        if(l == null){
            return r;
        }
        if(r == null){
            return l;
        }
        return root;
    }
}