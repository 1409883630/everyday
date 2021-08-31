//NC103 反转字符串
//写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串（字符串长度不超过1000）
import java.util.*;
public class Solution {
    /**
     * 反转字符串
     * @param str string字符串 
     * @return string字符串
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
