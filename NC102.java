//NC102 在二叉树中找到两个节点的最近公共祖先
//给定一棵二叉树(保证非空)以及这棵树上的两个节点对应的val值 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
//注：本题保证二叉树中每个节点的val值均不相同。
import java.util.*;
public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @param o1 int整型 
     * @param o2 int整型 
     * @return int整型
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