//NC19 �����������ۼӺ�����
//����һ������arr�����������������ۼӺ�
//���磬arr = [1, -2, 3, 5, -2, 6, -1]�������������У�[3, 5, -2, 6]�����ۼӳ����ĺ�12�����Է���12.
//��Ŀ��֤û��ȫΪ����������
//[Ҫ��]ʱ�临�Ӷ�ΪO(n)O(n)���ռ临�Ӷ�ΪO(1)O(1)
import java.util.*;


public class Solution {
    /**
     * max sum of the subarray
     * @param arr int����һά���� the array
     * @return int����
     */
    public int maxsumofSubarray (int[] arr) {
        // write code here
        //�����ʱ��
        int thisSum=0;
        //������մ𰸣�ע���ʼ����ֵ
        int ans = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i=0;i<len;i++ ){
            //�ۼ����
            thisSum+=arr[i];
            if(thisSum>ans){
                ans = thisSum;
            }
            //̰�ģ�������Ȼ���������к�
            if(thisSum<0){
                thisSum=0;
            }
        }
        return ans;
    }
}