//NC32 ��ƽ����
//ʵ�ֺ��� int sqrt(int x).
//���㲢����x��ƽ����������ȡ����
import java.util.*;
public class Solution {
    /**
     * 
     * @param x int���� 
     * @return int����
     */
    public int sqrt (int x) {
        // write code here
         for (int i = 0; i < x / 2 + 1; i++) {
        if (i * i <= x && (i + 1) * (i + 1) > x) {
            return i;
        }
    }
    return 1;
    }
}