//NC95 数组中的最长连续子序列
//给定无序数组arr，返回其中最长的连续序列的长度
//(要求值连续，位置可以不连续,例如 3,4,5,6为连续的自然数）、
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
