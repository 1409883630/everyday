//NC119 ��С��K����
//����һ�����飬�ҳ�������С��K��������������Ԫ����4,5,1,6,2,7,3,8��8�����֣�
//����С��4��������1,2,3,4��
//0 <= k <= input.length <= 10000
//0 <= input[i] <= 10000
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (k > input.length) {
            return al;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;
    }
}