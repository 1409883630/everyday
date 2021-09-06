//NC128 接雨水问题
//给定一个整形数组arr，已知其中所有的值都是非负的，
//将这个数组看作一个柱子高度图，计算按此排列的柱子，下雨之后能接多少雨水
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
