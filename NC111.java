//NC111 最大数
//给定一个nums数组由一些非负整数组成，现需要将他们进行排列并拼接，
//每个数不可拆分，使得最后的结果最大，返回值需要是string类型，否则可能会溢出
import java.util.*;
public class Solution {
    public String solve (int[] nums) {
        // write code here
        if (nums == null || nums.length == 0) {
            return "";
        }
        List<String> res = new ArrayList<>();
        for (int val : nums) {
            res.add(String.valueOf(val));
        }
        Collections.sort(res, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        if (res.get(0).equals("0")) return "0";
        for (String s : res) {
            sb.append(s);
        }
        return sb.toString();
    }
}