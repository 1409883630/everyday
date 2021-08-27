//NC45 实现二叉树先序，中序和后序遍历
//分别按照二叉树先序，中序和后序打印所有的节点。
import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */
public class Solution {
   
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer>list=new ArrayList<>();
        preOrder(root,list);
        int len=list.size();
        int[][]res=new int[3][len];
        fill(res,list,0);
        list.clear();
        inOrder(root,list);
        fill(res,list,1);
        list.clear();
        postOrder(root,list);
        fill(res,list,2);
        return res;
    }
    public void preOrder(TreeNode root,List<Integer>list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    public void inOrder(TreeNode root,List<Integer>list){
        if(root == null){
            return ;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public void postOrder(TreeNode root,List<Integer>list){
        if(root == null){
            return ;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
    public void fill(int[][]res,List<Integer>list,int j){
        for(int i=0;i<list.size();i++){
            res[j][i]=list.get(i);
        }
    }
}
