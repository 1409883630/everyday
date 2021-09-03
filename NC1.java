//NC1 �����ӷ�
//���ַ�������ʽ�����������֣���дһ�������������ǵĺͣ����ַ�����ʽ���ء�
//���ַ������Ȳ�����100000����֤�ַ�������'0'~'9'��10���ַ���ɣ�
import java.util.*;
public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     * ����������֮��
     * @param s string�ַ��� ��ʾ��һ������
     * @param t string�ַ��� ��ʾ�ڶ�������
     * @return string�ַ���
     */
    public String solve (String s, String t) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = s.length() - 1, j = t.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            carry += i >= 0 ? s.charAt(i--) - '0' : 0;
            carry += j >= 0 ? t.charAt(j--) - '0' : 0;
            stack.push(carry % 10);
            carry = carry / 10;
        }
        while (!stack.isEmpty())
            stringBuilder.append(stack.pop());
        return stringBuilder.toString();
    }
}