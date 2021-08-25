//NC41 最长无重复子数组
//给定一个数组arr，返回arr的最长无重复元素子数组的长度，无重复指的是所有数字都不相同。
//子数组是连续的，比如[1,3,5,7,9]的子数组有[1,3]，[3,5,7]等等，但是[1,3,7]不是子数组
import java.util.*;
public class Solution {
    public int maxLength (int[] arr) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        int p=0, ans=0;
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                int j=list.indexOf(arr[i]);
                while (j-->=0){
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            ans=Math.max(ans,list.size());
        }
        return ans;
    }
}