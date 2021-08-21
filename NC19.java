//NC19 子数组的最大累加和问题
//给定一个数组arr，返回子数组的最大累加和
//例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
//题目保证没有全为负数的数据
//[要求]时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
import java.util.*;


public class Solution {
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        // write code here
        //存放临时答案
        int thisSum=0;
        //存放最终答案，注意初始化的值
        int ans = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i=0;i<len;i++ ){
            //累加求和
            thisSum+=arr[i];
            if(thisSum>ans){
                ans = thisSum;
            }
            //贪心，负数必然会拉低序列和
            if(thisSum<0){
                thisSum=0;
            }
        }
        return ans;
    }
}