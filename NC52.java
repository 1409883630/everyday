//NC52 ��������
//����һ���������ַ�'(',')','{','}','['��']',���ַ������жϸ������ַ����Ƿ��ǺϷ�����������
//���ű�������ȷ��˳��رգ�"()"��"()[]{}"���ǺϷ����������У���"(]"��"([)]"���Ϸ���
import java.util.*;
public class Solution {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] temp = s.toCharArray();
        for (char c : temp){
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}