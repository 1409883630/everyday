//NC103 ��ת�ַ���
//д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ��������ַ������Ȳ�����1000��
import java.util.*;
public class Solution {
    /**
     * ��ת�ַ���
     * @param str string�ַ��� 
     * @return string�ַ���
     */
    public String solve (String str) {
        // write code here
       Stack<Object> stack = new Stack<>();
            StringBuffer bf = new StringBuffer();
            int i = 0;
            while(i < str.length()){
                stack.push(str.charAt(i));
                i++;
            }
            while(!stack.empty()){
                bf.append(stack.pop());
            }
            return bf.toString();
    }
}