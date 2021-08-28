//NC15 求二叉树的层序遍历
//给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
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
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
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
