//NC32 求平方根
//实现函数 int sqrt(int x).
//计算并返回x的平方根（向下取整）
import java.util.*;
public class Solution {
    /**
     * 
     * @param x int整型 
     * @return int整型
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