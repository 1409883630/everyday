//NC90 包含min函数的栈
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
//push(value):将value压入栈中
//pop():弹出栈顶元素
//top():获取栈顶元素
//min():获取栈中最小元素
import java.util.Stack;
public class Solution {
    Stack<Integer> normal= new Stack<Integer>();
    Stack<Integer> minval= new Stack<Integer>();
    public void push(int node) {
         normal.push(node);
        if(minval.isEmpty() || minval.peek()>node){
        minval.push(node);
        }else minval.push(minval.peek());
    }
    public void pop() {
        normal.pop();
        minval.pop();
    }
    public int top() {
        int a = normal.peek();
        return a;
    }
    public int min() {
        int a=minval.peek();
        return a;
    }
}