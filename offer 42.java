//��ָ Offer 42. ���������������
//����һ���������飬�����е�һ������������������һ�������顣������������ĺ͵����ֵ��

class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0];
        int former = 0;//���ڼ�¼dp[i-1]��ֵ������dp[0]���ԣ���ǰ���dp[-1]=0
        int cur = nums[0];//���ڼ�¼dp[i]��ֵ
        for(int num:nums){
            cur = num;
            if(former>0) cur +=former;
            if(cur>max) max = cur;
            former=cur;
        }
        return max;
    }
}