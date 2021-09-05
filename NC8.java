//NC8 ���������ڵ㵽Ҷ�ӽڵ��Ϊָ��ֵ��·��
//����һ����������һ��ֵ\ sum sum�����ҳ����еĸ��ڵ㵽Ҷ�ӽڵ�Ľڵ�ֵ֮�͵���\ sum sum ��·��
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        process(root,0,sum,new ArrayList<Integer>(),res);
        return res;
    }
    private void process(TreeNode root,int agg,int sum,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> res){
        path.add(root.val);
        agg += root.val;
        if(root.left==null&&root.right==null){
            if(agg==sum){
                res.add(new ArrayList<>(path));
            }
        }else{
            if(root.left!=null){
                process(root.left,agg,sum,path,res);
            }
            if(root.right!=null){
                process(root.right,agg,sum,path,res);
            }
        }
        path.remove(path.size()-1);
    }
}