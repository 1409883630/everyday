//NC105 二分查找-II
//请实现有重复数字的升序数组的二分查找
//给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，
//写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
import java.util.*;
public class Solution {
    public int search (int[] nums, int target) {
        // write code here
        int index = -1;
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (nums[mid] == target) {
                // 在low 到 mid之间找第一个下标
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