//NC128 ����ˮ����
//����һ����������arr����֪�������е�ֵ���ǷǸ��ģ�
//��������鿴��һ�����Ӹ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��
import java.util.*;
public class Solution {
    public long maxWater (int[] arr) {
        // write code here
        int n = arr.length;
        int idx1 = 0, point1 = 0;
        int idx2 = n - 1, point2 = n - 1;
        long sum = 0;
        while (point1 != point2) {
            if (arr[idx1] > arr[idx2]) {
                point2--;
                if (arr[idx2] > arr[point2]) {
                    sum += arr[idx2] - arr[point2];
                } else {
                    idx2 = point2;
                }
            } else {
                point1++;
                if (arr[idx1] > arr[point1]) {
                    sum += arr[idx1] - arr[point1];
                } else {
                    idx1 = point1;
                }
            }
        }
        return sum;
    }
}