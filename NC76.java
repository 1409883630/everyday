//NC76 用两个栈实现队列
//用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)
//和在队列头部删除整数(pop)的功能。 队列中的元素为int类型。
//保证操作合法，即保证pop操作时队列内已有元素
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    if (stack2.size() <= 0){
            while (stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
