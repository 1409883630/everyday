//NC52 括号序列
//给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
//括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法
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
