//NC111 �����
//����һ��nums������һЩ�Ǹ�������ɣ�����Ҫ�����ǽ������в�ƴ�ӣ�
//ÿ�������ɲ�֣�ʹ�����Ľ����󣬷���ֵ��Ҫ��string���ͣ�������ܻ����
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