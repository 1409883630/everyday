//剑指 Offer 42. 连续子数组的最大和
//输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0];
        int former = 0;//用于记录dp[i-1]的值，对于dp[0]而言，其前面的dp[-1]=0
        int cur = nums[0];//用于记录dp[i]的值
        for(int num:nums){
            cur = num;
            if(former>0) cur +=former;
            if(cur>max) max = cur;
            former=cur;
        }
        return max;
    }
}