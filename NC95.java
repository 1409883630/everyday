//NC95 �����е������������
//������������arr��������������������еĳ���
//(Ҫ��ֵ������λ�ÿ��Բ�����,���� 3,4,5,6Ϊ��������Ȼ����
import java.util.*;
public class Solution {
    public int MLS (int[] arr) {
        // write code here
        Arrays.sort(arr);
        int max = 1,len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]) continue;
            if (arr[i]==arr[i-1]+1) len++;
            else len = 1;
            max = Math.max(max,len);
        }
        return max;
    }
}