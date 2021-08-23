//NC105 ���ֲ���-II
//��ʵ�����ظ����ֵ���������Ķ��ֲ���
//����һ�� Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target  ��
//дһ���������� nums �еĵ�һ�����ֵ�target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1
import java.util.*;
public class Solution {
    public int search (int[] nums, int target) {
        // write code here
        int index = -1;
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (nums[mid] == target) {
                // ��low �� mid֮���ҵ�һ���±�
                index = mid;
                high = mid-1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
}
}