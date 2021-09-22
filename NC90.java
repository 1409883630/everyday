//NC90 ����min������ջ
//����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min���������ҵ��� min������push���� �� pop���� ��ʱ�临�Ӷȶ��� O(1)
//push(value):��valueѹ��ջ��
//pop():����ջ��Ԫ��
//top():��ȡջ��Ԫ��
//min():��ȡջ����СԪ��
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