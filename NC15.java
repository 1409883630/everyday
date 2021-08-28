//NC15 ��������Ĳ������
//����һ�������������ظö�������������Ľ�����������ң�һ��һ��ر�����
import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode�� 
     * @return int����ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
         ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        if(root == null){
            return res;
        }
        
        Deque<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        TreeNode rec = root;
        ArrayList<Integer> sub = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            sub.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }

            if(node == rec){
                rec = queue.peekLast();
                res.add(new ArrayList<>(sub));
                sub.clear();
            }
        }
        
        return res;
        
    }
}