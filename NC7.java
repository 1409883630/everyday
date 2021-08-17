//NC7 ������Ʊ�����ʱ��
//��������һ�����飬���е�\ i i ��Ԫ���ǹ�Ʊ�ڵ�\ i i ��ļ۸�
//����һ������������Ļ��ᡣ��ֻ�������˹�Ʊ�Ժ������������
//�������һ���㷨��������Ի�õ�������档
import java.util.*;
public class Solution {
    /**
     * 
     * @param prices int����һά���� 
     * @return int����
     */
    public int maxProfit (int[] prices) {
        // write code here
        // write code here
        int len = prices.length;
        // �����ж�
        if (len < 2) {
            return 0;
        }
        int[][] dp = new int[len][2];
 
        // dp[i][0] �±�Ϊ i ���������ʱ�򣬲��ֹɣ�����ӵ�е��ֽ���
        // dp[i][1] �±�Ϊ i ���������ʱ�򣬳ֹɣ�����ӵ�е��ֽ���
 
        // ��ʼ�������ֹ���ȻΪ 0���ֹɾ���Ҫ��ȥ�� 1 �죨�±�Ϊ 0���Ĺɼ�
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
 
        // �ӵ� 2 �쿪ʼ����
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[len - 1][0];
    }
}